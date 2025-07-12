package com.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long productId;
	private int quantity;
	private double totalAmount;
	private String status;

	public Order() {
	}

	public Order(Long id, Long productId, int quantity, double totalAmount, String status) {
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.status = status;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return "Order [id=" + this.id + ", productId=" + this.productId + ", quantity=" + this.quantity
				+ ", totalAmount=" + this.totalAmount + ", status=" + this.status + "]";
	}
}