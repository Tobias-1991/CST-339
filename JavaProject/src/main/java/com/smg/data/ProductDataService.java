package com.smg.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;


import com.smg.models.ProductModel;

@Service
public class ProductDataService implements DataAccessInterface<ProductModel> {
	
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}
	
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}
	
	public ProductDataService(DataSource dataSource) {
		
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<ProductModel> findAll() {
		
		  String sql = "SELECT * FROM PRODUCTS";
		  List<ProductModel> products = new ArrayList<ProductModel>();
		  try {
			  // Execute sql and loop over result set
			  SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			  while(srs.next()) {
				  products.add(new ProductModel(srs.getString("PRODUCT_NAME"),
						  						srs.getDouble("PRICE"),
						  						srs.getString("DESCRIPTION")));
			  }
		  }
		  catch (Exception e) {
			  e.printStackTrace();
		  }
		  return products;
	}
		  
	@Override
	public ProductModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(ProductModel product) {
		String sql = "INSERT INTO products (PRODUCT_NAME, PRICE, DESCRIPTION) VALUES(?, ?, ?)"; 	
		System.out.println("create method called successfully");
			
		try
		{
			// Execute SQL Insert
			System.out.println("passwords matched");
			
			int rows = jdbcTemplateObject.update(sql,
												product.getProductName(), 
												product.getProductCost(),
												product.getProductDescription());
			System.out.println("update method called");
			return rows == 1 ? true: false;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
		} 

	@Override
	public boolean update(ProductModel product) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(ProductModel t) {
		// TODO Auto-generated method stub
		return false;
	}

}
