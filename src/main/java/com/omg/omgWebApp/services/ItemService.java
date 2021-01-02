package com.omg.omgWebApp.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.constant.Contants;
import com.omg.omgWebApp.model.Item;
import com.omg.omgWebApp.repositories.ItemRepo;

@Component
public class ItemService {

	@Autowired
	private ItemRepo itemRepo;
	@Autowired
	ItemSizeQuantityPriceMapService itemSizeQuantityPriceMapService;
	
	public void addCloth(Item cloth, MultipartFile imageFile) {
		Path path = Paths.get(Contants.PATH_FOR_IMAGE + cloth.getName() +Contants.IMG_EXT_JPG);
		cloth.setImgPath(path.toString());
		saveImage(path,imageFile);
		this.itemRepo.save(cloth);
		int id = this.itemRepo.lastInsertId();
		saveSizeQuantityAndSizePriceMap(id,cloth);
	}
	
	private void saveSizeQuantityAndSizePriceMap(int id,Item cloth) {
		this.itemSizeQuantityPriceMapService.save(id, cloth);
		
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

	public List<Item> getItemByType(int typeId) {
		
		List<Item> itemList = this.itemRepo.findByItemType(typeId);
		this.itemSizeQuantityPriceMapService.fillMaps(itemList);
		return itemList;
	}

	public List<Item> getAllCloth() {
		return this.itemRepo.findAll();
	}
	

}
