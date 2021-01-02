package com.omg.omgWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omg.omgWebApp.model.Checkout;
import com.omg.omgWebApp.services.CheckoutService;

@RestController
public class CheckoutController {

	@Autowired
	private CheckoutService checkoutService;
	@PostMapping(value = "/checkout")
	public String checkout(@RequestBody Checkout checkout)
	{
		this.checkoutService.placeOrder(checkout);
		return "sucess";
	}
}
