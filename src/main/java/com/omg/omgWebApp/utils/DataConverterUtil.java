package com.omg.omgWebApp.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.Cloth;
import com.omg.omgWebApp.model.RequestCloth;

@Component
public class DataConverterUtil {
	
	public Cloth convertCloth(RequestCloth reqCloth, MultipartFile imageFile)
	{
		Cloth cloth = new Cloth(reqCloth.getName(),reqCloth.getPrice(),reqCloth.getType(),imageFile);
		return cloth;
	}
}
