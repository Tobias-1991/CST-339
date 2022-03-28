package com.smg.business;

import java.util.List;

import com.smg.models.OrderModel;

public interface OrdersBusinessInterface {
	public void test();
	
	public List<OrderModel> getOrders();
	
	public void init();
	
	public void destroy();

}
