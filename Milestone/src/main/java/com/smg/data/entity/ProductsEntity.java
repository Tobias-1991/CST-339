package com.smg.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class ProductsEntity {
	
	@Id
	String id;
	
	@Indexed(unique=true)
	String productNo;
	
	@Indexed(unique=true)
	String productName;
	
	float cost;
	int quantity;

	public String getId() {
		return id;
	}

	public ProductsEntity(String id, String productNo, String productName, float cost, int quantity) {
		super();
		this.id = id;
		this.productNo = productNo;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
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