package com.omg.omgWebApp.services;

import org.springframework.stereotype.Component;

@Component
public interface CartService{
	
	public void addToCart(int itemId, int userId, String size);
	public void disableCart(int userId);
	public void removeItemFromCart(int itemId, int userId, String size);
}
