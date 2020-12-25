package com.omg.omgWebApp.model;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;


@Data
@Entity
@NoArgsConstructor
public class Cloth implements Item {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ItemType itemType;
	@Column(name="image_path")
	private String imgPath;
	@Column(name="size")
	private String size;
	@Column(name= "quantity")
	private int quantity;
	
	@Transient  
	private MultipartFile image;
	
	public Cloth(String name,double price,ItemType type,MultipartFile image,String size,int quantity)
	{
		this.name = name;
		this.price = price;
		this.itemType = type;
		this.image = image;
		this.size = size;
		this.quantity = quantity;
	}
}
