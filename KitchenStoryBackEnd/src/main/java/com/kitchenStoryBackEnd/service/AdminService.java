package com.kitchenStoryBackEnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchenStoryBackEnd.entities.Admin;
import com.kitchenStoryBackEnd.repo.AdminRepo;

@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	public Admin addAdmin(Admin admin)
	{
		return adminRepo.save(admin);
	}
	
	public Admin getAdmin(Admin admin)
	{
		return adminRepo.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
	}
	
	
}
