package com.smg.business;

import java.util.ArrayList;
import java.util.List;

import com.smg.models.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface {

	
	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "0000000001", "Test Product 1", 1.00f, 1));
		orders.add(new OrderModel(0L, "0000000002", "Test Product 2", 1.00f, 1));
		orders.add(new OrderModel(0L, "0000000003", "Test Product 3", 1.00f, 1));
		orders.add(new OrderModel(0L, "0000000004", "Test Product 4", 1.00f, 1));
		orders.add(new OrderModel(0L, "0000000005", "Test Product 5", 1.00f, 1));
		
		return orders;
	} 
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("This is a test from the Sega my Genesis Store");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Init the Sega my Genesis Store");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy the Sega my Genesis Store");
	}

}
