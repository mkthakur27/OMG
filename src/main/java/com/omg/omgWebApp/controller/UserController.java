package com.omg.omgWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	@PostMapping(value = "/registerUser",consumes = { MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String>  registerUser(@RequestBody User user)
	{
		try
		{
			this.userService.registerUser(user);
			return ResponseEntity.ok().body("Sucessfully registered");
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
	@GetMapping("/dummyUser")
	public User getDummyUser()
	{
		return new User();
	}
}
