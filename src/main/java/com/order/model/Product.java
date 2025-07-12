package com.order.model;

public class Product {
	private Long id;
	private String name;
	private int stock;
	private double price;

	public Product() {
	}

	public Product(Long id, String name, int stock, double price) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.price = price;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Product [id=" + this.id + ", name=" + this.name + ", stock=" + this.stock + ", price=" + this.price
				+ "]";
	}
}
