package com.omg.omgWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.omg.omgWebApp.model.User;
import com.omg.omgWebApp.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/registerUser")
	String registerUser(@RequestBody User user)
	{
		this.userService.registerUser(user);
		return "Sucess";
	}
	
	@GetMapping("/dummyUser")
	public User getDummyUser()
	{
		return new User();
	}
}
