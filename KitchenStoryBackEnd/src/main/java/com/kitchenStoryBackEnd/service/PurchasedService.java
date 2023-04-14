package com.kitchenStoryBackEnd.service;

import java.util.List;

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
		purchased.setStatus("Pending");
		return purchasedRepo.save(purchased);
	}
	
	public List<Purchased> getAllPurchasedService()
	{
		List<Purchased> pur= (List<Purchased>) purchasedRepo.findAll();
		return pur;
	}
	
}
