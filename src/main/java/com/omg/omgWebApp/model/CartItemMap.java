package com.omg.omgWebApp.model;

import lombok.Data;

@Data
public class CartItemMap {

	private int cartId;
	private int itemId;
	private String size;
	private int quantity;
}
