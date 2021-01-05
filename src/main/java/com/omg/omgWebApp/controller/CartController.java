package com.omg.omgWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.omg.omgWebApp.services.CartServiceImp;

@RestController
public class CartController {
	
	@Autowired
	private CartServiceImp cartServiceImp;
	
	@PostMapping(path = "/addItem1", consumes = "application/json", produces = "application/json")
	public void addToCart(@RequestBody ObjectNode objectNode)
	{
		int itemId = objectNode.get("itemId").asInt();
		int userId = objectNode.get("userId").asInt();
		String size = objectNode.get("size").asText();
		this.cartServiceImp.addToCart(itemId, userId, size);
	}
	
	@PostMapping(path = "/disableCart", consumes = "application/json", produces = "application/json")
	public void disableCart(@RequestBody ObjectNode objectNode)
	{
		int userId = objectNode.get("userId").asInt();
		this.cartServiceImp.disableCart(userId);
	}
	
	@PostMapping(path = "/removeItemFromCart", consumes = "application/json", produces = "application/json")
	public void removeItemFromCart(@RequestBody ObjectNode objectNode)
	{
		int itemId = objectNode.get("itemId").asInt();
		int userId = objectNode.get("userId").asInt();
		String size = objectNode.get("size").asText();
		this.cartServiceImp.removeItemFromCart(itemId, userId, size);
	}
	
	public int getCartByUser(int userId)
	{
		return 1;
	}
}
