package com.omg.omgWebApp.model;

import java.util.List;

import lombok.Data;

@Data
public class Cart {
	private int id;
	private short isActive;
	private List<CartItemMap> itemList;
}