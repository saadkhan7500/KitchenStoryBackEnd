package com.kitchenStoryBackEnd.repo;

import org.springframework.data.repository.CrudRepository;

import com.kitchenStoryBackEnd.entities.User;

public interface UserRepo extends CrudRepository<User, String> 
{
     public User findByEmail(String email);
}
