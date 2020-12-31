package com.omg.omgWebApp.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.Cloth;
import com.omg.omgWebApp.model.ItemType;
import com.omg.omgWebApp.model.RequestCloth;
import com.omg.omgWebApp.repositories.ItemTypeRepo;

@Component
public class DataConverterUtil {
	
	@Autowired
	ItemTypeRepo itemTypeRepo;
	
	public Cloth convertRequestClothToCloth(RequestCloth reqCloth, MultipartFile imageFile)
	{
		ItemType itemType = itemTypeRepo.findByTypeName(reqCloth.getType());
		Cloth cloth = new Cloth(reqCloth.getName(),reqCloth.getPrice(),itemType.getId(),imageFile,reqCloth.getSize(),
				reqCloth.getQuantity());
		return cloth;
	}
	
	public RequestCloth convertClothToRequestCloth(Cloth cloth)
	{
		ItemType itemType = itemTypeRepo.findById(cloth.getTypeId());
		return new RequestCloth(cloth.getName(), cloth.getPrice(), itemType.getName(), cloth.getSize(),cloth.getQuantity());
	}
}
