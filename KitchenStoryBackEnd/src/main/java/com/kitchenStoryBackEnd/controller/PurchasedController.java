package com.kitchenStoryBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStoryBackEnd.entities.Purchased;
import com.kitchenStoryBackEnd.service.PurchasedService;

@RestController
@CrossOrigin
public class PurchasedController {

	@Autowired
	private PurchasedService purchasedService;
	
	
	@PostMapping("/addPurchased")
	public Purchased addPurchased(@RequestBody Purchased purchased) 
	{
		return purchasedService.addPurchased(purchased);
	}
	@GetMapping("/getAllPurchased")
	public List<Purchased> getAllPurchased()
	{
		return purchasedService.getAllPurchasedService();
	}
}
