package com.omg.omgWebApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemType {
	
	private int id;
	private String name;
	private String imgPath;
	public ItemType(String name)
	{
		this.name = name;
	}
}
