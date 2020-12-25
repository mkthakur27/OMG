package com.omg.omgWebApp.utils;

import java.util.List;

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
		List<ItemType> allItemTypes = itemTypeRepo.findAllByType(reqCloth.getType());
		ItemType itemType = allItemTypes.get(0);
		Cloth cloth = new Cloth(reqCloth.getName(),reqCloth.getPrice(),itemType,imageFile,reqCloth.getSize(),
				reqCloth.getQuantity());
		return cloth;
	}
	
	public RequestCloth convertClothToRequestCloth(Cloth cloth)
	{
		return new RequestCloth(cloth.getName(), cloth.getPrice(), cloth.getItemType().getType(), cloth.getSize(),cloth.getQuantity());
	}
}
