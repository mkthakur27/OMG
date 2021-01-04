package com.omg.omgWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.omg.omgWebApp.services.CartService;
import com.omg.omgWebApp.services.CartServiceImp;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private CartServiceImp cartServiceImp;
	
	@PostMapping(path = "/addItem1", consumes = "application/json", produces = "application/json")
	public Integer addToCart(@RequestBody ObjectNode objectNode)
	{
		int itemId = objectNode.get("itemId").asInt();
		int userId = objectNode.get("userId").asInt();
		String size = objectNode.get("size").asText();
		int quantity = objectNode.get("quantity").asInt();
		double price = objectNode.get("price").asDouble();
		this.cartServiceImp.addToCart(itemId, userId, size, quantity, price);
		
		return 100;
	}
	
	public int getCartByUser(int userId)
	{
		return 1;
	}
}
