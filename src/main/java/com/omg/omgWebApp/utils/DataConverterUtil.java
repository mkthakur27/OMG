package com.omg.omgWebApp.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.Cloth;
import com.omg.omgWebApp.model.ItemType;
import com.omg.omgWebApp.model.RequestCloth;

@Component
public class DataConverterUtil {
	
	public Cloth convertClothToRequestCloth(RequestCloth reqCloth, MultipartFile imageFile)
	{
		Cloth cloth = new Cloth(reqCloth.getName(),reqCloth.getPrice(),new ItemType(reqCloth.getType()),imageFile,reqCloth.getSize(),
				reqCloth.getQuantity());
		return cloth;
	}
	
	public RequestCloth convertClothToRequestCloth(Cloth cloth)
	{
		return new RequestCloth(cloth.getName(), cloth.getPrice(), cloth.getType().getType(), cloth.getSize(),cloth.getQuantity());
	}
}
