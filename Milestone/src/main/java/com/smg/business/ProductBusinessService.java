package com.smg.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.smg.data.ProductDataService;
import com.smg.data.entity.ProductsEntity;
import com.smg.model.ProductModel;

public class ProductBusinessService implements ProductBusinessInterface {
	
	@Autowired
	ProductDataService productService;
	
	@Autowired
	public BCryptPasswordEncoder encode;

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the Product Business Service");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the Product Business Service Init Method");
		System.out.println(encode.encode("test"));
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the Product Business Service Destroy Method");
	}
	
	@Override
	public List<ProductModel> getProducts() {
		List<ProductsEntity> productsEntity = productService.findAll();
		
		List<ProductModel> productDomain = new ArrayList<ProductModel>();
		for(ProductsEntity entity : productsEntity) {
			productDomain.add(new ProductModel(entity.getId(), entity.getProductNo(), entity.getProductName(), entity.getCost(), entity.getQuantity()));
		}
		return productDomain;
	}
	@Override
	public ProductModel getProductById(String id) {

		ProductsEntity productEntity = productService.findById(id);
		
		return new ProductModel(productEntity.getId(), productEntity.getProductNo(), productEntity.getProductName(), productEntity.getCost(), productEntity.getQuantity());
	}

}
