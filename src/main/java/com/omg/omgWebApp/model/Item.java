package com.omg.omgWebApp.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Item {

	private int id;
	private String name;
	private int typeId;
	private String imgPath;
	private Map<String,Integer> sizeQuantityMap = new HashMap<>();
	private Map<String,Double> sizePriceMap = new HashMap<>();
	private String description;
	private int brandId;
	private Section section; 
	
	public Item(String name,Map<String,Double> sizePrice,int typeId,Map<String,Integer> sizeQuantity,String description,int brandId,
			Section section)
	{
		this.name = name;
		this.sizePriceMap = sizePrice;
		this.typeId = typeId;
		this.sizeQuantityMap = sizeQuantity;
		this.description = description;
		this.brandId = brandId;
		this.section = section;
	}
}
