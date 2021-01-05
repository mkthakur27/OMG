package com.omg.omgWebApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omg.omgWebApp.model.Cart;
//import com.omg.omgWebApp.model.Cart;
import com.omg.omgWebApp.model.CartUserMap;
import com.omg.omgWebApp.repositories.CartRepo;

@Component
public class CartServiceImp {
	
	@Autowired
	private CartRepo cartRepo;

	public void addToCart(int itemId, int userId, String size, int quantity, double price) {
		System.out.println("temp");
		List<CartUserMap> cart_user_list = this.cartRepo.getCartId(userId);
		List<Integer> cart_list = new ArrayList<>();
		boolean found_active_cart = false;
		int active_cart_id = 0;
		
		for (CartUserMap elm: cart_user_list)
		{
			cart_list.add(elm.getCartId());
			System.out.println(elm.getCartId());
		}

		for (Integer cartId: cart_list)
		{
			Cart active_cart = this.cartRepo.isActive(cartId);
			short active_or_not = active_cart.getIsActive();
			System.out.println(active_or_not);
			if (active_or_not == 11)
			{
				found_active_cart = true;
				active_cart_id = cartId;
				break;
			}
			
		}
		if (found_active_cart == true)
		{
			boolean item_already_exists_in_cart = false;
			List<Integer> existing_quantity= this.cartRepo.getCartItem(active_cart_id, itemId, size);
			for (Integer quan: existing_quantity) {
				System.out.println(quan);
				quantity += quan;
				item_already_exists_in_cart = true;
			}
			if (item_already_exists_in_cart == true) {
				this.cartRepo.updateQuantity(active_cart_id, itemId, size, quantity);
			}
			else{
				this.cartRepo.addToCart(active_cart_id, itemId, size, quantity);
			}
		}
		else
		{
			short isActive = 11;
			this.cartRepo.addNewCartId(isActive);
			active_cart_id = this.cartRepo.lastInsertId();
			this.cartRepo.addToCart(active_cart_id, itemId, size, quantity);
			this.cartRepo.addCartUserMap(active_cart_id, userId);
		}
				
	}
	
}