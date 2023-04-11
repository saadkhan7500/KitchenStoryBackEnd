package com.kitchenStoryBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStoryBackEnd.entities.Product;
import com.kitchenStoryBackEnd.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProducts()
	{
		return productService.getProducts();
	}
	
}
