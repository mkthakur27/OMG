package com.omg.omgWebApp.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.Brand;
import com.omg.omgWebApp.services.BrandService;

@RestController
public class BrandController {

	private BrandService brandService;
	
	@GetMapping("/getAllBrand")
	public List<Brand> getAllBrands()
	{
		return brandService.getAllBrand();
	}

	@PostMapping(value="/addBrand",consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE })
	public String addBrand(@RequestPart("brand") Brand brand,@RequestPart("image")MultipartFile imageFile,@RequestPart("logo")MultipartFile logo )
	{
		this.brandService.addBrand(brand, imageFile,logo);
		return "sucess";
	}
	
	@GetMapping("/dummyBrand")
	public Brand getDummyBrand()
	{
		return new Brand();
	}
}
