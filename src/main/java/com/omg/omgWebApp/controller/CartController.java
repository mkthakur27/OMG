package com.omg.omgWebApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	@PostMapping("/addItem")
	public void addItem(int cardId,int userId,int itemId,int size,int quantity)
	{
		
	}
	
	public int getCartByUser(int userId)
	{
		return 1;
	}
}
