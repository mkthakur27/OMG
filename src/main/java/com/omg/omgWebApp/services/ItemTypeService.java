package com.omg.omgWebApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omg.omgWebApp.model.ItemType;
import com.omg.omgWebApp.repositories.ItemTypeRepo;

@Component
public class ItemTypeService {

	@Autowired
	private ItemTypeRepo itemTypeRepo;
	
	public List<ItemType> getAllTypes() {
		return this.itemTypeRepo.findAll();
	}

	public void addType(ItemType itemType) {
		this.itemTypeRepo.save(itemType.getName());
		
	}
	
	public ItemType getItemTypeByType(String type_name)
	{
		return this.itemTypeRepo.findByTypeName(type_name);
	}
}
