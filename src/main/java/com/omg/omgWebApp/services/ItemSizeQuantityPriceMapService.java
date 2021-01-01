package com.omg.omgWebApp.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omg.omgWebApp.model.Item;
import com.omg.omgWebApp.model.ItemSizeQuantityPriceMap;
import com.omg.omgWebApp.repositories.ItemSizeQuantityPriceMapRepo;


@Component
public class ItemSizeQuantityPriceMapService {
	@Autowired
	private ItemSizeQuantityPriceMapRepo itemSizeQuantityPriceMapRepo;

	public void fillMaps(List<Item> itemList)
	{
		for (Item item : itemList)
		{
			List<ItemSizeQuantityPriceMap> lst =  this.itemSizeQuantityPriceMapRepo.findByItemId(item.getId());
			Map<String,Integer> sizeQuantityMap = new HashMap<>();
			Map<String,Double> sizePriceMap = new HashMap<>();
			for (ItemSizeQuantityPriceMap elm : lst)
			{
				sizeQuantityMap.put(elm.getSize(), elm.getQuantity());
				sizePriceMap.put(elm.getSize(), elm.getPrice());
			}
			item.setSizeQuantityMap(sizeQuantityMap);
			item.setSizePriceMap(sizePriceMap);
		}
	}

	public void save(int id, Item cloth) {
		for (String size : cloth.getSizePriceMap().keySet())
		{
			this.itemSizeQuantityPriceMapRepo.save(id,size,cloth.getSizeQuantityMap().get(size),cloth.getSizePriceMap().get(size));
		}
	}
}
