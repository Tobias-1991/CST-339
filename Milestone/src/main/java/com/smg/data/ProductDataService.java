package com.smg.data;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smg.data.entity.ProductsEntity;
import com.smg.data.repository.ProductsRepository;

@Service
public class ProductDataService implements DataAccessInterface<ProductsEntity> {
	
	@Autowired
	private ProductsRepository repository;
	
	public void ProductsDataService(ProductsRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<ProductsEntity> findAll() {
		
		List<ProductsEntity> products = new ArrayList<ProductsEntity>();
		
		try {
			Iterable<ProductsEntity> productsIterable = repository.findAll();
		 
			products = new ArrayList<ProductsEntity>();
			productsIterable.forEach(products::add);
		  }
		  catch (Exception e) {
			  e.printStackTrace();
		  }
		  return products;
	}
		  
	@Override
	public ProductsEntity findById(String id) {
		
		return repository.getProductById(id);
	}
	
	@Override
	public boolean create(ProductsEntity product) {
		try {
			this.repository.save(product);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
			}
		return true;
		} 

	@Override
	public boolean update(ProductsEntity product) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(ProductsEntity product) {
		// TODO Auto-generated method stub
		return false;
	}

}
