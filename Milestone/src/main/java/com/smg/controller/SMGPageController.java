/*package com.smg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smg.business.ProductBusinessInterface;
import com.smg.data.DataAccessInterface;
import com.smg.model.ProductModel;
import com.smg.model.UserModel;

@Controller
@RequestMapping("/")
public class SMGPageController {
	
	@Autowired
	DataAccessInterface<UserModel> access;
	@Autowired
	DataAccessInterface<ProductModel> productAccess;
	
	private ProductBusinessInterface productInterface;
	

	// For Admin login page
	@GetMapping("/localowner/admin/adminLogin")
	public String goAdminLogin(Model model) {
		model.addAttribute("title", "SMG GAMING | Admin Login");
		return "admin/adminLogin";
	}
	@GetMapping("/account/login")
	public String goToLogin() {
		//model.addAttribute("title", "SMG GAMING | Login");
		System.out.println("If account/login is called");
		return "account/login";
	}
	//For Failed Login page
		@GetMapping("/login-failure")
		public String loginFailure(Model model) {
			//model.addAttribute("title", "SMG GAMING | Login");
			System.out.println("Login Failure");
			System.out.println("If login error is called");

			return "login";
		}
		
	@GetMapping("/user-login-success")
	public String loginSuccess() {
		System.out.println("User logged in successfully");
		return "user-login-success";
	}
	
	@GetMapping("/doLogin")
	public String doLogin() {
		System.out.println("doLogin is being called");
		return "user-login-success";
	}
	
		@GetMapping("/account/addProduct")
		public String goAddProducts(WebRequest request, Model model) {
			ProductModel productModel = new ProductModel();
			model.addAttribute("title", "SMG GAMING ADMIN | Add Products");
			model.addAttribute("ProductModel", productModel);
			return "account/addProduct";
		}
			
		@PostMapping("/doAddProduct")
		public ModelAndView doAddProduct(
			@ModelAttribute("ProductModel")
			@Valid ProductModel productModel,
			HttpServletRequest request,
			Errors errors,
			Model model) {
			ModelAndView mav = new ModelAndView();
			try {
				productAccess.create(productModel);
				System.out.println("Trying to create a new product");
			} catch (Exception e) {
				e.printStackTrace();
				mav.addObject("/account/addProduct", "Add Product Error");
				return mav; 
			}
			return new ModelAndView("/user-login-success", "ProductModel", productModel);
		}
	
	    For Register page
		@GetMapping("/account/register")
		public String goToSignUp(WebRequest request, Model model) {
			UserModel userModel = new UserModel();
			model.addAttribute("title", "SMG GAMING | Register");
			model.addAttribute("UserModel", userModel);
			return "account/register";
		}
		@PostMapping("/doRegistration")
		public ModelAndView doRegistration(
			@ModelAttribute("UserModel")
			@Valid UserModel userModel,
			HttpServletRequest request, 
			Errors errors, Model model) {
			ModelAndView mav = new ModelAndView();
			try {
				access.create(userModel);
			} catch (Exception e) {
				e.printStackTrace();
				mav.addObject("account/register", "Registration error");
				return mav;
			}
			return new ModelAndView("/user-login-success", "UserModel", userModel);
		}
		
		@GetMapping("/register/success")
		public String registerSuccess() {
			System.out.println("New user registered successfully");
			return "/";
		}
		
		@PostMapping("/logout-success")
		public String logout(Model model) {
			return "/";
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
		// For Admin Dashboard
		@GetMapping("/localowner/admin/dashboard")
		public String goAdminDash(Model model) {
			model.addAttribute("title", "SMG GAMING ADMIN | Dashboard");
			return "admin/dashboard";
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
		@PostMapping("/viewProducts")
		public String browse(Model model) {
			model.addAttribute("title", "SMG GAMING | All Products");
			model.addAttribute("products", productInterface.getProducts());
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
		
}*/
