package com.omg.omgWebApp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.Item;
import com.omg.omgWebApp.model.ItemType;
import com.omg.omgWebApp.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	
	@PostMapping(value = "/addItem",consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE })
	public String addItem(@RequestPart("image") MultipartFile image,
			@RequestPart("item") Item item) {
		this.itemService.addCloth(item,image);
		return "Sucess";
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/getItemsByType/{type}")
	public List<Item> getItem(@PathVariable(value="type") int type)
	{
		return this.itemService.getItemByType(type);
	}
	
	@GetMapping("/getItemsByBrand/{brand}")
	public List<Item> getItemByBrandId (@PathVariable(value="brand") int brandId)
	{
		return this.itemService.getItemByBrandId(brandId);
	}
	
	@GetMapping("/dummyItem")
	public Item getDummyCloth()
	{
		return new Item();
	}
	
	@GetMapping("/cloth")
	public List<Item> getAllItem(){
		return this.itemService.getAllCloth();
	}

}
