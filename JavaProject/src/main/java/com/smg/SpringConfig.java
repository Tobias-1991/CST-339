package com.smg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.smg.business.OrdersBusinessInterface;
import com.smg.business.OrdersBusinessService;

@Configuration
public class SpringConfig {
	
	@Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
	public OrdersBusinessInterface getOrdersBusiness() {
		
		return new OrdersBusinessService();
	}

}
