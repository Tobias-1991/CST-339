package com.smg.model;

import java.util.ArrayList;
import java.util.List;

public class ProductListModel {
	
	private List<ProductModel> products = new ArrayList<ProductModel>();
	
	public List<ProductModel> getProducts() {
		return products;
	}
	
	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}
	
}
