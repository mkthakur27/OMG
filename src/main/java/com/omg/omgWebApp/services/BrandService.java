package com.omg.omgWebApp.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.Brand;

public interface BrandService {
	public List<Brand> getAllBrand();
	public void addBrand(Brand brand,MultipartFile imageFile,MultipartFile logo);
	public Brand getBrandById(int id);
}
