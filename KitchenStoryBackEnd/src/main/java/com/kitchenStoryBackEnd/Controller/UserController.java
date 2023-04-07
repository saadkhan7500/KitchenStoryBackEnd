package com.kitchenStoryBackEnd.Controller;

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

import com.kitchenStoryBackEnd.Entities.User;
import com.kitchenStoryBackEnd.Repo.UserRepo;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	UserRepo repo;
	
	
	//API to add the new user at the time of registration
	@PostMapping("/addUser")
	String addUser(@RequestBody User user)
	{
		System.out.println("Add user API calling");
		repo.save(user);
		return "success";
	}
	
	//API to get the user by email
	@GetMapping("getUser/{email}")
	User getUserByEmail(@PathVariable String email)
	{
		User u = null;
		System.out.println("Get user API calling "+email);
		u = repo.findByEmail(email);
		System.out.println(u);
	    return u;
	}
	
	//API to authenticate the user at the time of login
	@PostMapping("/checkUser")
	User  AuthenticateUser(@RequestBody User user)
	{
		System.out.println("Authenticate user API calling");
		User u = repo.findByEmail(user.getEmail());
		if(u!=null)
		{
	        if(u.getPassword().equals(user.getPassword()))
	        {
	        	return u;
	        }
	        else
	        {
	        	return null;
	        }
		}
		return null;
	}
	
	@GetMapping("/getAllUsers")
	List<User> getAllUsers()
	{
		System.out.println("Get all user API calling");
		List<User> u= (List<User>) repo.findAll();
		return u;
	}
	
	//Edit User API
	@PutMapping("/editUser")
	String editUser(@RequestBody User user)
	{
		User u = repo.findByEmail(user.getEmail());
		if(u!=null)
		{
		u.setName(user.getName());
		u.setGender(user.getGender());
		u.setPno(user.getPno());
		u.setDob(user.getDob());
		u.setPassword(user.getPassword());
		repo.save(u);
		return "Success";
		}
		return "User not found with this email";
	}
	
	//Delete User API
	@DeleteMapping("deleteUser/{email}")
	String deleteUser(@PathVariable String email)
	{
		User u = repo.findByEmail(email);		
		if(u!=null)
		{
			repo.delete(u);
			return "Success";
		}
		return "User not found with this email";
	}
}
