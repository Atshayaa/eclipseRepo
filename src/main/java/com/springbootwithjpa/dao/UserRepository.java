package com.springbootwithjpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springbootwithjpa.model.User;

public interface UserRepository extends CrudRepository<User, String>{

	//User addUser(User user);

    // public User findByUserId(int userId); //user defined function
	 public User findByUserName(String userName);
     
     //syntax
     //prefixed with find by and property name
}
