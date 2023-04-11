package com.kitchenStoryBackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStoryBackEnd.entities.Admin;
import com.kitchenStoryBackEnd.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin)
	{
		return adminService.addAdmin(admin);
	}
	
	@PostMapping("/checkAdmin")
	public Admin getAdmin(@RequestBody Admin admin)
	{
		return adminService.getAdmin(admin);
	}
}
