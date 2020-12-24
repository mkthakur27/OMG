package com.omg.omgWebApp.model;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

import javax.persistence.GeneratedValue;


@Data
@Entity
public class Cloth implements Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double price;
	@OneToOne(cascade = CascadeType.ALL)
	private ItemType type;
	private String imgPath;
	private String size;
	private int quantity;
	
	@Transient  
	private MultipartFile image;
	
	public Cloth(String name,double price,ItemType type,MultipartFile image,String size,int quantity)
	{
		this.name = name;
		this.price = price;
		this.type = type;
		this.image = image;
		this.size = size;
		this.quantity = quantity;
	}
}
