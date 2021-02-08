package com.omg.omgWebApp.validator;

import org.springframework.stereotype.Component;

import com.omg.omgWebApp.exception.RegistrationException;
import com.omg.omgWebApp.model.User;

@Component
public class UserRegistrationValidator {

	private void validatePassword(String password,String confirmPassword) throws RegistrationException
	{
		if (!password.contentEquals(confirmPassword))
		{
			throw new RegistrationException("Password and confirm Password Does not match");
		}
		
		if (password.length() < 8)
		{
			throw new RegistrationException("password must be of atleast 8 character long");
		}
	}
	public void validate(User user) throws RegistrationException
	{
		validatePassword(user.getPassword(),user.getConfirmPassword());
	}
}
