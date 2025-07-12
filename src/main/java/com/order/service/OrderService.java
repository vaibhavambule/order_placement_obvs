package com.order.service;

import com.order.dto.OrderRequest;
import com.order.exception.OutOfStockException;
import com.order.exception.PaymentFailedException;
import com.order.mock.InventoryService;
import com.order.mock.PaymentService;
import com.order.model.Order;
import com.order.model.Product;
import com.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	private InventoryService inventoryService;
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private OrderRepository orderRepository;

	public Order placeOrder(OrderRequest request) {
		Product product = this.inventoryService.getProduct(request.getProductId());
		if (product == null) {
			throw new IllegalArgumentException("Product not found.");
		} else {
			boolean locked = this.inventoryService.lockAndDeductStock(request.getProductId(), request.getQuantity());
			if (!locked) {
				throw new OutOfStockException("Product is out of stock.");
			} else {
				double total = product.getPrice() * (double) request.getQuantity();
				boolean paid = this.paymentService.processPayment(total);
				Order order = new Order();
				order.setProductId(product.getId());
				order.setQuantity(request.getQuantity());
				order.setTotalAmount(total);
				order.setStatus(paid ? "SUCCESS" : "FAILED");
				if (!paid) {
					throw new PaymentFailedException("Payment failed.");
				} else {
					return (Order) this.orderRepository.save(order);
				}
			}
		}
	}
}