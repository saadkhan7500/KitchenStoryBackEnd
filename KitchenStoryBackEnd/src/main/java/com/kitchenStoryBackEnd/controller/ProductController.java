package com.kitchenStoryBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStoryBackEnd.entities.Product;
import com.kitchenStoryBackEnd.repo.ProductRepo;
import com.kitchenStoryBackEnd.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductRepo productRepo;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@GetMapping("/getProducts")
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	
	@PutMapping("/uploadImage/{id}")
	public void uploadImage(@PathVariable("id") int id,@RequestBody String url)
	{
		System.out.println("calling uplaodImage api.....");
		System.out.println(id);
		System.out.println(url);
		
		Product product=productRepo.findById(id);
		product.setImgname(url);
		productRepo.save(product);
	}

	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return productService.getProductByIdService(id);
	}
	
}
