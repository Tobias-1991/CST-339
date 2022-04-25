package com.smg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smg.business.ProductBusinessInterface;
import com.smg.model.ProductModel;


@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	private ProductBusinessInterface service;
	
	@GetMapping("/display")
	public String display(Model model) {
		
		// Get some Orders
		List<ProductModel> products = service.getProducts();
		
		// Display the Orders View
		model.addAttribute("title", "My Orders");
		model.addAttribute("products", products);
		return "products";
	}
	
}
