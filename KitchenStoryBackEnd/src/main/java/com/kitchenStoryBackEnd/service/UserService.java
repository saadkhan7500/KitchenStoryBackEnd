package com.kitchenStoryBackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchenStoryBackEnd.authentication.UserAuthentication;
import com.kitchenStoryBackEnd.entities.User;
import com.kitchenStoryBackEnd.repo.ProductRepo;
import com.kitchenStoryBackEnd.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User addUser(User user)
	{
		return userRepo.save(user);	
	}
	
	public User AuthenticateUser(UserAuthentication user)
	{
		User u = userRepo.findByEmail(user.getEmail());
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
	
	public User getUserByEmail(String email)
	{
		User u = null;
		u = userRepo.findByEmail(email);
		return u;
	}
	
	public List<User> getAllUsers()
	{
		List<User> u= (List<User>) userRepo.findAll();
		return u;
	}
	
	public User editUser(User user)
	{
		User u = userRepo.findByEmail(user.getEmail());
		if(u!=null)
		{
		u.setName(user.getName());
		u.setGender(user.getGender());
		u.setPno(user.getPno());
		u.setDob(user.getDob());
		u.setPassword(user.getPassword());
		return userRepo.save(u);
		 
		}
		return u;
	}
	
	public String deleteUser(String email)
	{
		User u = userRepo.findByEmail(email);		
		if(u!=null)
		{
			userRepo.delete(u);
			return "Success";
		}
		return "User not found with this email";
	}

}
