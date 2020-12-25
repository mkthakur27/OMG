package com.omg.omgWebApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.omg.omgWebApp.model.Cloth;
import com.omg.omgWebApp.model.ItemType;

public interface ClothRepo extends JpaRepository<Cloth, Integer>{

//	List<Cloth> findByItemType(final ItemType type);
	List<Cloth> findByItemType(ItemType type);
}
