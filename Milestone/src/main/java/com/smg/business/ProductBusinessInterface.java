package com.smg.business;

import java.util.List;

import com.smg.model.ProductModel;

public interface ProductBusinessInterface {

	public void test();
	
	public List<ProductModel> getProducts();
	
	public ProductModel getProductById(String id);
	
	public void init();
	
	public void destroy();

}
