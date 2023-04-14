package com.kitchenStoryBackEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchenStoryBackEnd.entities.Purchased;
import com.kitchenStoryBackEnd.repo.PurchasedRepo;

@Service
public class PurchasedService {
	
	@Autowired
	private PurchasedRepo purchasedRepo;
	
	public Purchased addPurchased(Purchased purchased)
	{
		return purchasedRepo.save(purchased);
	}

}
