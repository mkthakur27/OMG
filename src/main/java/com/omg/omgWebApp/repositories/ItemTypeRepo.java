package com.omg.omgWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omg.omgWebApp.model.ItemType;

public interface ItemTypeRepo extends JpaRepository<ItemType, Integer> {
	

}
