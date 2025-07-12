package com.order.controller;

import com.order.dto.OrderRequest;
import com.order.exception.OutOfStockException;
import com.order.exception.PaymentFailedException;
import com.order.model.Order;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/orders"})
public class OrderController {
   @Autowired
   private OrderService orderService;

   @PostMapping
   public ResponseEntity<?> placeOrder(@RequestBody OrderRequest request) {
      try {
         Order order = this.orderService.placeOrder(request);
         return ResponseEntity.ok(order);
      } catch (PaymentFailedException | IllegalArgumentException | OutOfStockException var3) {
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(var3.getMessage());
      }
   }
}
