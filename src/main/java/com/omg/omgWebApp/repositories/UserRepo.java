package com.omg.omgWebApp.repositories;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.omg.omgWebApp.model.User;

@Mapper
public interface UserRepo {
	
	@Select("select * from user where userid= #{id}")
	User findById(int id);
	
	@Insert("insert into user(name,mobilenumber,emailId,userrole,password) values(#{name},#{mobileNumber},#{emaiId},#{role},#{password})")
	void registerUser(User user);

}
