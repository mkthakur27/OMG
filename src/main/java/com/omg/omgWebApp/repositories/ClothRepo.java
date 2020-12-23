package com.omg.omgWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omg.omgWebApp.model.Cloth;

public interface ClothRepo extends JpaRepository<Cloth, Integer>{

	
}
