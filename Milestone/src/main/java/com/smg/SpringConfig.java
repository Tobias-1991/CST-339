package com.smg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.smg.business.ProductBusinessInterface;
import com.smg.business.ProductBusinessService;



@Configuration
public class SpringConfig {
	
	@Bean(name="productBusinessService", initMethod="init", destroyMethod="destroy")
	public ProductBusinessInterface getProductsBusiness() {
		
		return new ProductBusinessService();
	}

}

	