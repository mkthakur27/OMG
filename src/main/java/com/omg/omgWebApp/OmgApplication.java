package com.omg.omgWebApp;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.omg.omgWebApp.model.Item;
import com.omg.omgWebApp.model.ItemType;

@MappedTypes({ItemType.class,Item.class})
@MapperScan({"com.omg.omgWebApp.repositories"})
@SpringBootApplication
public class OmgApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmgApplication.class, args);
	}
}
