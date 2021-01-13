package com.omg.omgWebApp.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.omg.omgWebApp.model.ItemType;

@Mapper
public interface ItemTypeRepo  {
	
	@Select("select * from itemtype")
	List<ItemType> findAll();
	@Insert("insert into itemtype(name,imgPath) values(#{name},#{imgPath})")
	public void save(ItemType item);
	@Select("select name from itemtype where id=#{id}")  
	ItemType findById(int id);
	@Select("select id from itemtype where name=#{name}")
	ItemType findByTypeName(String name);
}
