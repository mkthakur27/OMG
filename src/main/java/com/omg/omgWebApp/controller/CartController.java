package com.omg.omgWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.omg.omgWebApp.model.CartItemMap;
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
	
//	@PostMapping(path = "/disableCart", consumes = "application/json", produces = "application/json")
	
	@PostMapping("/disableCart/{userId}")
	public void disableCart(@PathVariable String userId)
	{
//		int userId = objectNode.get("userId").asInt();
		this.cartServiceImp.disableCart(Integer.parseInt(userId));
	}
	
	@PostMapping(path = "/removeItemFromCart", consumes = "application/json", produces = "application/json")
	public void removeItemFromCart(@RequestBody ObjectNode objectNode)
	{
		int itemId = objectNode.get("itemId").asInt();
		int userId = objectNode.get("userId").asInt();
		String size = objectNode.get("size").asText();
		this.cartServiceImp.removeItemFromCart(itemId, userId, size);
	}
	
	@GetMapping("/getCartByUser/{userId}")
	public List<CartItemMap> getCartByUser(@PathVariable String userId)
	{
//		int userId = objectNode.get("userId").asInt();
		System.out.println(userId);
		return this.cartServiceImp.getCartByUser(Integer.parseInt(userId));
//		return 1;
	}
	
	// Just for testing
	@GetMapping("/getAllCart")
	public List<CartItemMap> getAllCart(){
		return this.cartServiceImp.getAllCart();
	}
}
