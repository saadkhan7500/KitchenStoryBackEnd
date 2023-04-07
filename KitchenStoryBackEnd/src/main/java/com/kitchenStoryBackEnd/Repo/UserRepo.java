package com.kitchenStoryBackEnd.Repo;

import org.springframework.data.repository.CrudRepository;

import com.kitchenStoryBackEnd.Entities.User;

public interface UserRepo extends CrudRepository<User, String> 
{
     public User findByEmail(String email);
}
