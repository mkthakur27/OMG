package com.omg.omgWebApp.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.omg.omgWebApp.model.Cloth;
import com.omg.omgWebApp.model.ItemType;

@Mapper
public interface ClothRepo{

	@Select("select * from cloth")
	List<Cloth> findAll();
	
	@Select("select * from cloth where item_type=#{id}")
	List<Cloth> findByItemType(ItemType type);
	
	@Insert("insert into cloth(name,price,typeid,imgpath,size,quantity) values(#{name},#{price},#{typeId},#{imgPath},#{size},#{quantity})")
	public void save(Cloth cloth);
}
