package com.omg.omgWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Checkout {

	private int cartId;
	private int userId;
	private Address address;
}
