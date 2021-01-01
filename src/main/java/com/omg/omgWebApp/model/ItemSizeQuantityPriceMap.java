package com.omg.omgWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemSizeQuantityPriceMap {
	
	private int itemId;
	private String size;
	private int quantity;
	private double price;
}
