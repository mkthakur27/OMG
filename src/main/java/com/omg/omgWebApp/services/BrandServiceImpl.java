package com.omg.omgWebApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.model.Brand;
import com.omg.omgWebApp.repositories.BrandRepo;
import com.omg.omgWebApp.utils.SaveImageUtil;

@Component
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepo brandRepo;
	
	@Autowired
	private SaveImageUtil saveImageUtil;
	
	@Override
	public List<Brand> getAllBrand() {
		return this.brandRepo.findAll();
	}

	@Override
	public void addBrand(Brand brand, MultipartFile imageFile,MultipartFile logo) {
		String imgPath = saveImageUtil.saveImage(brand.getName(), imageFile);
		brand.setImgPath(imgPath);
		String logoImgPath = saveImageUtil.saveImage(brand.getName()+"Logo", logo);
		brand.setLogoImgPath(logoImgPath);
		this.brandRepo.save(brand);
	}

	@Override
	public Brand getBrandById(int id) {
		return this.brandRepo.findById(id);
	}

	
}
