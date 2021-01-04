package com.omg.omgWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.omg.omgWebApp.repositories.CartRepo;

@Component
public class CartService {

	@Autowired
	private CartRepo cartRepo;
	
	public void addItem(int itemId, String size, int quantity, double price) {
		System.out.println("khan");
//		this.cartRepo.save(itemId, size, quantity, price);
	}
}
