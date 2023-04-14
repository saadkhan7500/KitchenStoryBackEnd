package com.kitchenStoryBackEnd.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kitchenStoryBackEnd.entities.Purchased;

@Repository
public interface PurchasedRepo extends CrudRepository<Purchased, Integer>{

}
