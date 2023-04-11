package com.kitchenStoryBackEnd.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kitchenStoryBackEnd.entities.Product;


@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{
	  
   Product findById(int id);
}
