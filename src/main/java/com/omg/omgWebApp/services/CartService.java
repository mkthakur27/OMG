package com.omg.omgWebApp.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.omg.omgWebApp.model.CartItemMap;

@Component
public interface CartService{
	
	public void addToCart(int itemId, int userId, String size);
	public void disableCart(int userId);
	public void removeItemFromCart(int itemId, int userId, String size);
	public List<CartItemMap> getCartByUser(int userId);
}
