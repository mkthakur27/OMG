package com.omg.omgWebApp.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.omg.omgWebApp.model.Brand;
import com.omg.omgWebApp.model.ItemType;

@Mapper
public interface BrandRepo {

	@Select("select * from brand")
	public List<Brand> findAll();
	
	@Insert("insert into brand(name,imgpath,logoimgPath) values(#{name},#{imgPath},#{logoImgPath})")
	public void save(Brand brand);
	
	@Select("select name from brand where id=#{id}")  
	Brand findById(int id);
	@Select("select id from brand where name=#{name}")
	Brand findByName(String name);
}
