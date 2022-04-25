package com.smg.model;

public class ProductModel {
	
	private String id;
	private String productNo;
	private String productName;
	private float cost;
	private int quantity;
	

	public ProductModel(String id, String productNo, String productName, float cost, int quantity) {
		super();
		this.id = id;
		this.productNo = productNo;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getProductNo() {
		return productNo;
	}


	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
}
