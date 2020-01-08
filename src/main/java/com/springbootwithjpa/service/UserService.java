package com.springbootwithjpa.service;

import com.springbootwithjpa.model.User;

public interface UserService {
     public User addUser(User user);

     public User findByUserName(String userName);
     
}
