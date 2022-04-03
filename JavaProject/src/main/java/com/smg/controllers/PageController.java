/*package com.smg.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smg.business.OrdersBusinessInterface;
import com.smg.business.SecurityBusinessService;
import com.smg.models.LoginModel;



@Controller
@RequestMapping("/")
public class PageController {
	
	@Autowired()
	private OrdersBusinessInterface service;
	
	@Autowired()
	private SecurityBusinessService security;
	
	//Go to the login page
	@GetMapping("/login")
	public String goToLogin() {
		return "login";	
	}
	
	//Go to the product page
	@GetMapping("/product")
	public String goToProduct() {
		return "product";
	}
	
	@PostMapping("/addProduct")
	public String doProduct(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		service.test();
		System.out.println("Thank you for adding a new product");
		
			return "index";
		}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		//Check for errors
		service.test();
		security.authenticateUser("zach@gmail", "password");
		
		if (bindingResult.hasErrors()) {
			//model.addAttribute("title", "Login Form");
			System.out.println("Unable to authenticate user");
			return "index";
		}

		return "index";
	}
	
	//go to the register page
	@GetMapping("/register")
	public String goToRegister() {
		return "register";	
	}
	
	//admin go to the login page
	@GetMapping("/adminLogin")
	public String goAdminLogin() {
		return "adminLogin";	
	}
	@PostMapping("/doRegistration")
	public String doRegistration(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		//Check for errors
		service.test();
		System.out.println("Thank you for registering");
		
			return "index";
		}
	
	@PostMapping("/doAdminLogin")
	public String doAdminLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		//Check for errors
		service.test();
		security.authenticateAdminUser("zach@gmail", "password");
		
		if (bindingResult.hasErrors()) {
			//model.addAttribute("title", "Login Form");
			System.out.println("Unable to authenticate admin user");
			return "index";
		}

		return "index";
	}
}*/
