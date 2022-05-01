package com.smg.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.smg.business.ProductBusinessInterface;
import com.smg.data.DataAccessInterface;
import com.smg.model.ProductModel;

@Controller
@RequestMapping("/products")
public class ProductsController {
	
	
	DataAccessInterface<ProductModel> productAccess; 
	
	@Autowired
	private ProductBusinessInterface service;
	
	@GetMapping("/display")
	public String display(Model model) {
		
		// Get some Orders
		List<ProductModel> products = service.getProducts();
		
		// Display the Orders View
		model.addAttribute("title", "My Products");
		model.addAttribute("products", products);
		return "products/allProducts";
	}
	
	@GetMapping("/newProduct")
	public String addProduct(WebRequest request, Model model) {
		ProductModel productModel = new ProductModel();
		model.addAttribute("title", "SMG GAMING | Add a Product");
		model.addAttribute("ProductModel", productModel);
		return "products/product";
	}
	@PostMapping("/addProduct")
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
		return new ModelAndView("products/product", "ProductModel", productModel);
	}
	
}
