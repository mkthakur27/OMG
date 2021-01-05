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
public class CartServiceImp implements CartService{
	
	@Autowired
	private CartRepo cartRepo;

	public void addToCart(int itemId, int userId, String size) {
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
			if (active_or_not == 1)
			{
				found_active_cart = true;
				active_cart_id = cartId;
				break;
			}
		}
		if (found_active_cart == true)
		{
			boolean item_already_exists_in_cart = false;
			List<Integer> existing_quantity = this.cartRepo.getCartItem(active_cart_id, itemId, size);
			if (existing_quantity.size() > 0)
			{
				item_already_exists_in_cart = true;
			}
			if (item_already_exists_in_cart != true) {
				this.cartRepo.addToCart(active_cart_id, itemId, size);
			}
		}
		else
		{
			this.cartRepo.addNewCartId();
			active_cart_id = this.cartRepo.lastInsertId();
			this.cartRepo.addToCart(active_cart_id, itemId, size);
			this.cartRepo.addCartUserMap(active_cart_id, userId);
		}	
	}

	public void disableCart(int userId) {
		List<CartUserMap> cart_user_list = this.cartRepo.getCartId(userId);
		List<Integer> cart_list = new ArrayList<>();
		
		for (CartUserMap elm: cart_user_list)
		{
			cart_list.add(elm.getCartId());
		}
		for (Integer cartId: cart_list)
		{
			Cart active_cart = this.cartRepo.isActive(cartId);
			short active_or_not = active_cart.getIsActive();
			System.out.println(active_or_not);
			if (active_or_not != 0)
			{
				this.cartRepo.disableCart(cartId);
			}
		}
	}

	public void removeItemFromCart(int itemId, int userId, String size) {
		List<CartUserMap> cart_user_list = this.cartRepo.getCartId(userId);
		List<Integer> cart_list = new ArrayList<>();
		
		for (CartUserMap elm: cart_user_list)
		{
			cart_list.add(elm.getCartId());
		}

		for (Integer cartId: cart_list)
		{
			Cart active_cart = this.cartRepo.isActive(cartId);
			short active_or_not = active_cart.getIsActive();
			System.out.println(active_or_not);
			if (active_or_not == 1)
			{
				this.cartRepo.removeItemFromCart(cartId, itemId, size);
				break;
			}
		}
	}
}