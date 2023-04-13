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
	
	public String addUserService(User user)
	{
		userRepo.save(user);
		return "Success";
	}
	
	public User AuthenticateUserService(UserAuthentication user)
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
	
	public User getUserByEmailServic(String email)
	{
		User u = null;
		u = userRepo.findByEmail(email);
		return u;
	}
	
	public List<User> getAllUsersService()
	{
		List<User> u= (List<User>) userRepo.findAll();
		return u;
	}
	
	public String editUserService(User user)
	{
		User u = userRepo.findByEmail(user.getEmail());
		if(u!=null)
		{
		u.setName(user.getName());
		u.setGender(user.getGender());
		u.setPno(user.getPno());
		u.setDob(user.getDob());
		u.setPassword(user.getPassword());
		userRepo.save(u);
		return "Success";
		}
		return "User not found with this email";
	}
	
	public String deleteUserService(String email)
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
