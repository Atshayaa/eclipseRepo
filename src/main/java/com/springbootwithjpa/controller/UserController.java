package com.springbootwithjpa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbootwithjpa.dao.UserRepository;
import com.springbootwithjpa.model.User;
import com.springbootwithjpa.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/reset")
	public ModelAndView startPage(@ModelAttribute User user) {

		ModelAndView modelAndView = new ModelAndView("userReg");
		return modelAndView;
	}

	@RequestMapping("/register")
	public ModelAndView display(@Valid @ModelAttribute User user, BindingResult bindingResult) {
		User user1 = null;
		if (bindingResult.hasErrors()) {
			return new ModelAndView("userReg");
		} else if (user.getPassword().equals(user.getConfirmPassword())) {
			user1 = userService.addUser(user);
		} else {
			System.out.println("username and password does not match");
			return new ModelAndView("userReg");
		}
		return new ModelAndView("login");
	}

	@RequestMapping("/loginCredentials")
	public ModelAndView loginPage(@ModelAttribute User user) {
		User user1 = userService.findByUserName(user.getUserName());
		if (user.getUserName().equals(user1.getUserName()) && user.getPassword().equals(user1.getPassword())) {
			return new ModelAndView("registrationSuccess");
		} else {
			return new ModelAndView("login");
		}

	}

}
