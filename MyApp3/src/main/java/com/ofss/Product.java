package com.ofss;

public class Product {
	
	String productName;
	double productPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}
