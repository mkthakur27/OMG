package com.omg.omgWebApp.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.omg.omgWebApp.model.Item;
import com.omg.omgWebApp.model.ItemType;

@Mapper
public interface ItemRepo{

	@Select("select * from item")
	public List<Item> findAll();
	
	@Select("select * from item where typeid=#{typeId}")
	public List<Item> findByItemType(int typeId);
	
	@Insert("insert into item(name,imgPath,typeid,description,brand) values(#{name},#{imgPath},#{typeId},#{description},#{brand})")
	public void save(Item cloth);
	
	@Select("SELECT LAST_INSERT_ID()")
	public int lastInsertId();
}
