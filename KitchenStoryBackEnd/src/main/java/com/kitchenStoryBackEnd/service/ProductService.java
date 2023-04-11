package com.kitchenStoryBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchenStoryBackEnd.entities.Product;
import com.kitchenStoryBackEnd.repo.ProductRepo;



@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;

	
	public Product addProduct(Product product) 
	{ 
		product.setStatus("added");
		return productRepo.save(product); 
		
     }
	
	public List<Product> getProducts()  {
		
		 List<Product> products=(List<Product>) productRepo.findAll();
		 
		 return products;
		 
	
	}
	
	public Product getProduct(int id)
	{ 
		Product product=productRepo.findById(id);
		return product;
	}
	
	public Product updateProduct(Product product , int id)
	{
		Product p=productRepo.findById(id);
		
			p.setName(product.getName());
			p.setKcal(product.getKcal());
			p.setCategory(product.getCategory());
			p.setDiscount(product.getDiscount());
			p.setPrice(product.getPrice());
			p.setQuantity(product.getQuantity());
			p.setStatus(product.getStatus());
			
			
		    return productRepo.save(p);
		
	}
	
	/*
	 * public List<Product> findProdcutsByCategory(String category) { List<Product>
	 * products=productRepo.findProdcutsByCategory(category); return products; }
	 */
	
	/*
	 * public List<Product> findProductsByBrandOrCatgegory(String search) throws
	 * ProductException { List<Product>
	 * products=productRepo.findProductsByBrandOrCatgegory(search);
	 * if(products.size()!=0) return products; else throw new
	 * ProductException("product does not exist"); }
	 */

}
