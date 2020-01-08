package com.springbootwithjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootwithjpa.dao.UserRepository;
import com.springbootwithjpa.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User findByUserName(String userName) {
		
		return userRepository.findByUserName(userName);
	}

}
