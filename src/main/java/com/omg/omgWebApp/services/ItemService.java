package com.omg.omgWebApp.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.constant.Contants;
import com.omg.omgWebApp.model.Cloth;
import com.omg.omgWebApp.model.Item;
import com.omg.omgWebApp.model.ItemType;
import com.omg.omgWebApp.model.RequestCloth;
import com.omg.omgWebApp.repositories.ClothRepo;
import com.omg.omgWebApp.utils.DataConverterUtil;

@Component
public class ItemService {

	@Autowired
	private ClothRepo clothRepo;
	@Autowired
	private DataConverterUtil dataConverter;
	
	@Autowired
	
	
	public void addCloth(RequestCloth reqCloth, MultipartFile imageFile) {
		Item cloth = dataConverter.convertCloth(reqCloth, imageFile);
		Path path = Paths.get(Contants.PATH_FOR_IMAGE + reqCloth.getName() +Contants.IMG_EXT_JPG);
		saveImage(path,imageFile);
		clothRepo.save((Cloth) cloth);
	}
	
	public void saveImage(Path path,MultipartFile imageFile) {
		byte[] bytes = null;
		try {
			bytes = imageFile.getBytes();
		} catch (IOException e) {
			System.err.println("No Image Found");
			e.printStackTrace();
		}
		try {
			Files.write(path, bytes);
		} catch (IOException e) {
			System.err.println("Problem in adding file to path " + e.getMessage());
			e.printStackTrace();
		}
	}

	public List<String> getAllTypes() {
		return Stream.of(ItemType.values()).map(ItemType::name)
                .collect(Collectors.toList());
	}

	public void addType(String type) {
		
		
	}
	

}
