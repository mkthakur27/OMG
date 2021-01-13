package com.omg.omgWebApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.ItemType;
import com.omg.omgWebApp.repositories.ItemTypeRepo;
import com.omg.omgWebApp.utils.SaveImageUtil;

@Component
public class ItemTypeService {

	@Autowired
	private ItemTypeRepo itemTypeRepo;
	
	@Autowired
	private SaveImageUtil saveImageUtil;
	
	public List<ItemType> getAllTypes() {
		return this.itemTypeRepo.findAll();
	}

	public void addType(ItemType itemType,MultipartFile imageFile) {
		String path = saveImageUtil.saveImage(itemType.getName(), imageFile);
		itemType.setImgPath(path);
		this.itemTypeRepo.save(itemType);
	}
	
	public ItemType getItemTypeByType(String type_name)
	{
		return this.itemTypeRepo.findByTypeName(type_name);
	}
}
