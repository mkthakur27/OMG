package com.omg.omgWebApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omg.omgWebApp.model.ItemType;

public interface ItemTypeRepo extends JpaRepository<ItemType, Integer> {
	
	List<ItemType> findAllByType(String item_name);
}
