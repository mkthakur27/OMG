package com.omg.omgWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	int userId;
	String name;
	String mobileNumber;
	String emaiId;
	UserRole role;
}
