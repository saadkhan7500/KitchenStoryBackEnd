package com.kitchenStoryBackEnd.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kitchenStoryBackEnd.entities.Product;


@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{
	  
   Product findById(int id);
   
   @Query(value="select * from Product p where p.name = :search or p.category = :search and p.status='added' " , nativeQuery=true)
   List<Product> findProductsByNameOrCatgegory(@Param("search")String search);

}
