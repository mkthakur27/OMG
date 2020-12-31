package com.omg.omgWebApp.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Cloth implements Item {

	private int id;
	private String name;
	private double price;
	private int typeId;
	private String imgPath;
	private String size;
	private int quantity;	
	private MultipartFile image;
	
	public Cloth(String name,double price,int type,MultipartFile image,String size,int quantity)
	{
		this.name = name;
		this.price = price;
		this.typeId = type;
		this.image = image;
		this.size = size;
		this.quantity = quantity;
	}
}
