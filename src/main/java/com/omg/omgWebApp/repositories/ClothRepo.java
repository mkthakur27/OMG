package com.omg.omgWebApp.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.omg.omgWebApp.model.Cloth;
import com.omg.omgWebApp.model.ItemType;

@Mapper
public interface ClothRepo{

	@Select("select * from cloth")
	List<Cloth> findAll();
	List<Cloth> findByItemType(ItemType type);
	public void save(Cloth cloth);
}
