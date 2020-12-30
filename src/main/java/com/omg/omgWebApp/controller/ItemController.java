package com.omg.omgWebApp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

import com.omg.omgWebApp.model.ItemType;
import com.omg.omgWebApp.model.RequestCloth;
import com.omg.omgWebApp.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	
	@PostMapping(value = "/addItem",consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE })
	public RequestCloth addItem(@RequestPart("image") MultipartFile image,
			@RequestPart("cloth") RequestCloth reqCloth) {
		this.itemService.addCloth(reqCloth,image);
		return reqCloth;
	}
	
	@GetMapping("/getItemsByType")
	public List<RequestCloth> getItem(@RequestBody ItemType type)
	{
		return this.itemService.getItemByType(type);
	}
	
	@GetMapping("/dummyCloth")
	public RequestCloth getDummyCloth()
	{
		return new RequestCloth();
	}
	
	@GetMapping("/cloth")
	public List<RequestCloth> getAllItem(){
		return this.itemService.getAllCloth();
	}

}
