package com.omg.omgWebApp.model;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCloth {

	private String name;
	private int typeId;
	private Map<String,Integer> sizeQuantity = new HashMap<>();
	private Map<String,Double> sizePrice = new HashMap<>();
}
