package com.smg.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.smg.data.DataAccessInterface;
import com.smg.models.ProductModel;

public class ProductBusinessService implements ProductBusinessInterface {
	
	@Autowired
	DataAccessInterface<ProductModel> productService;

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the Product Business Service");
	}

	@Override
	public List<ProductModel> getProducts() {
		List<ProductModel> products = new ArrayList<ProductModel>();
		products = productService.findAll();
		
		return products;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the Product Business Service Init Method");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the Product Business Service Destroy Method");
	}

}
