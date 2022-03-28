package com.smg.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="products")
public class ProductListModel {
	
	private List<ProductModel> products = new ArrayList<ProductModel>();
	
	@XmlElement(name="product")
	public List<ProductModel> getProducts() {
		return products;
	}
	
	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}
	
	
	

}
