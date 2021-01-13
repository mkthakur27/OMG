package com.omg.omgWebApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.Item;
import com.omg.omgWebApp.repositories.ItemRepo;
import com.omg.omgWebApp.utils.SaveImageUtil;

@Component
public class ItemService {

	@Autowired
	private ItemRepo itemRepo;
	@Autowired
	ItemSizeQuantityPriceMapService itemSizeQuantityPriceMapService;
	
	@Autowired
	SaveImageUtil saveImageUtil;
	
	public void addCloth(Item item, MultipartFile imageFile) {
		String path = saveImageUtil.saveImage(item.getName(), imageFile);
		item.setImgPath(path);
		this.itemRepo.save(item);
		int id = this.itemRepo.lastInsertId();
		saveSizeQuantityAndSizePriceMap(id,item);
	}
	
	private void saveSizeQuantityAndSizePriceMap(int id,Item cloth) {
		this.itemSizeQuantityPriceMapService.save(id, cloth);
		
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
