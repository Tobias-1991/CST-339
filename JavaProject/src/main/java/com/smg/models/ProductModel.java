package com.smg.models;

public class ProductModel {
	
	private int ProductID;
	private String ProductName;
	private double ProductCost;
	private double ProductRetailPrice;
	private String ProductIMG;
	
	
	public ProductModel(String productName, double productCost, double productRetailPrice, String productIMG) {
		super();
		ProductName = productName;
		ProductCost = productCost;
		ProductRetailPrice = productRetailPrice;
		ProductIMG = productIMG;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductCost() {
		return ProductCost;
	}
	public void setProductCost(long productCost) {
		ProductCost = productCost;
	}
	public double getProductRetailPrice() {
		return ProductRetailPrice;
	}
	public void setProductRetailPrice(long productRetailPrice) {
		ProductRetailPrice = productRetailPrice;
	}
	public String getProductIMG() {
		return ProductIMG;
	}
	public void setProductIMG(String productIMG) {
		ProductIMG = productIMG;
	}

	
}
