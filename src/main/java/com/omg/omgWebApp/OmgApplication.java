package com.omg.omgWebApp;

import org.apache.ibatis.type.MappedTypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.omg.omgWebApp.model.Cloth;

@MappedTypes(Cloth.class)
@SpringBootApplication
@ComponentScan({"com.omg.omgWebApp.repositories"})
//@EntityScan("com.omg.omgWebApp.repositories")
public class OmgApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmgApplication.class, args);
	}

}
