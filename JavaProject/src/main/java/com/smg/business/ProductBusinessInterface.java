package com.smg.business;

import java.util.List;

import com.smg.models.ProductModel;

public interface ProductBusinessInterface {

	public void test();
	
	public List<ProductModel> getProducts();
	
	public void init();
	
	public void destroy();

}
