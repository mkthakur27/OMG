package com.omg.omgWebApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemType {
	
	private int id;
	private String type;
	public ItemType(String type)
	{
		this.type = type;
	}
}
