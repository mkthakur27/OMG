package com.omg.omgWebApp.model;

import java.util.List;

import lombok.Data;

@Data
public class User {
	int userId;
	String fullName;
	int mobileNumber;
	String emaiId;
	List<Address> addresses;
	int cartId;
}
