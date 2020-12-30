package com.omg.omgWebApp.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.omg.omgWebApp.model.ItemType;

@Mapper
public interface ItemTypeRepo  {
	
	List<ItemType> findAllByType(String item_name);
	List<ItemType> findAll();
	public void save(ItemType itemType);
}
