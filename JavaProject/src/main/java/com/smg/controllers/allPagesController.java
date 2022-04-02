package com.smg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class allPagesController {

	// For Home Page
	@GetMapping("/")
	public String goHome(Model model) {
		model.addAttribute("title", "SMG GAMING | Home");
		return "index";
	}
//=================Customer Account Pages===============================

	// For Login page
	@GetMapping("/account/login")
	public String goToLogin(Model model) {
		model.addAttribute("title", "SMG GAMING | Login");
		return "account/login";
	}

	// For Register page
	@GetMapping("/account/register")
	public String goToSignUp(Model model) {
		model.addAttribute("title", "SMG GAMING | Register");
		return "account/register";
	}

	// For Profile page
	@GetMapping("/account/profile")
	public String goToMyProfile(Model model) {
		model.addAttribute("title", "SMG GAMING | My Profile");
		return "account/profile";
	}

	// For Cart page
	@GetMapping("/account/cart")
	public String goToMyCart(Model model) {
		model.addAttribute("title", "SMG GAMING | My Cart");
		return "account/cart";
	}

// =================Admin Account Pages===============================
	// For Admin login page
	@GetMapping("/localowner/admin/adminLogin")
	public String goAdminLogin(Model model) {
		model.addAttribute("title", "SMG GAMING | Admin Login");
		return "admin/adminLogin";
	}

	// For Admin Dashboard
	@GetMapping("/localowner/admin/dashboard")
	public String goAdminDash(Model model) {
		model.addAttribute("title", "SMG GAMING ADMIN | Dashboard");
		return "admin/dashboard";
	}

	// For Admin Manage Products
	@GetMapping("/localowner/admin/products")
	public String goAdminProducts(Model model) {
		model.addAttribute("title", "SMG GAMING ADMIN | Mange Products");
		return "admin/manageProducts";
	}

// =================General SMG GAMING Pages===============================
	// For FAQ Page
	@GetMapping("/faq")
	public String faq(Model model) {
		model.addAttribute("title", "SMG GAMING | FAQs");
		return "general/faq";
	}

	// For About page
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "SMG GAMING | About Us");
		return "general/aboutUs";
	}
// =================Product Pages (from all to specific)=====================

	// For Browse Page
	@GetMapping("/products/all")
	public String browse(Model model) {
		model.addAttribute("title", "SMG GAMING | All Products");
		return "products/allProducts";
	}

	// For Brand in the URL
	@RequestMapping("/products/{brandURL}")
	public String findProductBrand(@PathVariable String brandURL, Model model) {
		String brandTitle = brandURL.toUpperCase();
		model.addAttribute("title", "SMG GAMING | " + brandTitle);
		model.addAttribute("brand", brandURL);
		return "products/productBrand";
	}

	// For Brand Specifics in the URL
	@RequestMapping("/products/{brandURL}/{console}")
	public String findProductBrandConsole(@PathVariable String brandURL, @PathVariable String console, Model model) {
		String brandTitle = brandURL.toUpperCase();
		String consoleTitle = console.toUpperCase();
		model.addAttribute("title", "SMG | " + brandTitle + " - " + consoleTitle);
		model.addAttribute("brand", brandURL);
		model.addAttribute("console", console);
		return "products/productConsole";
	}

	// For Brand Item in the URL
	@RequestMapping("/products/{brandURL}/{console}/{id}")
	public String findProductID(@PathVariable String brandURL, @PathVariable String console, @PathVariable Integer id,
			Model model) {
		model.addAttribute("title", "SMG | PRODUCT NAME");
		model.addAttribute("brand", brandURL);
		model.addAttribute("console", console);
		model.addAttribute("productID", id);
		return "products/productItem";
	}
}