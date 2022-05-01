package com.smg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
		
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "My Home");
		return "/user-login-success";
	}
	@GetMapping("/faq")
	public String faq(Model model) {
		model.addAttribute("title", "faq");
		return "/general/faq";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "about");
		return "/general/aboutUs";
	}
	@GetMapping("/account")
	public String account(Model model) {
		model.addAttribute("title", "account");
		return "/account/userAccount";
	}
	
}
