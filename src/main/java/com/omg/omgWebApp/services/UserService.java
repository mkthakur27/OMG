package com.omg.omgWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.omg.omgWebApp.exception.RegistrationException;
import com.omg.omgWebApp.model.User;
import com.omg.omgWebApp.model.UserRole;
import com.omg.omgWebApp.repositories.UserRepo;
import com.omg.omgWebApp.validator.UserRegistrationValidator;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Component
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();;
	
	@Autowired
	private UserRegistrationValidator validator;
	
	public void registerUser(User user) throws RegistrationException
	{
		validator.validate(user);
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRole(UserRole.CUSTOMER);
		this.userRepo.registerUser(user);
	}
}
