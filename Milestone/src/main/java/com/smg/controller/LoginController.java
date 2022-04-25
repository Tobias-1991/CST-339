package com.smg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController 
{

	@GetMapping("/login")
	public String display(Model model) {
		
		model.addAttribute("title", "Login Form");
		return "login";
	}
	/*
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		//Check for errors
		service.test();
		security.authenticate("zachary", "password");
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}

		//Display the Orders view
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", service.getOrders());
		
		return "orders";
		
		
	}
	*/

}
