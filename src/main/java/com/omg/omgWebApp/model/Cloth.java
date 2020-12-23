package com.omg.omgWebApp.model;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.GeneratedValue;


@Entity
public class Cloth implements Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double price;
	private ItemType type;
	private String imgPath;
	
	@Transient  //we don't want to insert this in db
	private MultipartFile image;
	
	public Cloth(String name,double price,ItemType type,MultipartFile image)
	{
		this.name = name;
		this.price = price;
		this.type = type;
		this.image = image;
	}
	
	public Cloth() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public ItemType getType() {
		return type;
	}

	@Override
	public void setImgPath(String path) {
		this.imgPath = path;
		
	}

	@Override
	public String getImgPath() {
		return imgPath;
	}

	@Override
	public String toString() {
		return "Cloth [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", imgPath=" + imgPath
				+ "]";
	}

	@Override
	public MultipartFile getImage() {
		
		return image;
	}

	@Override
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
}
