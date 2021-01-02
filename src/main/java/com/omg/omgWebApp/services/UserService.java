package com.omg.omgWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omg.omgWebApp.model.User;
import com.omg.omgWebApp.repositories.UserRepo;

@Component
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void registerUser(User user)
	{
		this.userRepo.registerUser(user);
	}
}
