package com.omg.omgWebApp.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.omg.omgWebApp.model.ItemSizeQuantityPriceMap;

@Mapper
public interface ItemSizeQuantityPriceMapRepo {
	
	@Select("select * from item_size_quantity_price_map where itemid = #{itemId}")
	public List<ItemSizeQuantityPriceMap> findByItemId(int itemId);
	
	@Insert("insert into item_size_quantity_price_map(itemid,size,quantity,price) values(#{itemId},#{size},#{quantity},#{price})")
	public void save(int itemId, String size, Integer quantity, Double price);
	
	
}
