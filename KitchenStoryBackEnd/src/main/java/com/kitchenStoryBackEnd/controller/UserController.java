package com.kitchenStoryBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitchenStoryBackEnd.authentication.UserAuthentication;
import com.kitchenStoryBackEnd.entities.User;
import com.kitchenStoryBackEnd.service.UserService;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	UserService service;
	
	
	//API to add the new user at the time of registration
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) throws InterruptedException
	{
		System.out.println("Add user API calling");
		Thread.sleep(2000);
	    return service.addUser(user);
	}
	
	//API to get the user by email
	@GetMapping("getUser/{email}")
	public User getUserByEmail(@PathVariable String email)
	{
		
		System.out.println("Get user API calling "+email);
	    return service.getUserByEmail(email);
	}
	
	//API to authenticate the user at the time of login
	@PostMapping("/checkUser")
	public User AuthenticateUser(@RequestBody UserAuthentication user)
	{
		System.out.println("Authenticate user API calling");
		
		User u = service.AuthenticateUser(user);
		
		return u;
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers()
	{
		System.out.println("Get all user API calling");
		return service.getAllUsers();
	}
	
	//Edit User API
	@PutMapping("/editUser")
	public User editUser(@RequestBody User user)
	{
		return service.editUser(user);
	}
	
	//Delete User API
	@DeleteMapping("deleteUser/{email}")
	String deleteUser(@PathVariable String email)
	{
	     return service.deleteUser(email);
	}
}
