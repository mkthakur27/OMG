package com.omg.omgWebApp.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.constant.Contants;
import com.omg.omgWebApp.model.Cloth;
import com.omg.omgWebApp.model.Item;
import com.omg.omgWebApp.model.RequestCloth;
import com.omg.omgWebApp.repositories.ClothRepo;

@Component
public class ItemService {

	@Autowired
	private ClothRepo clothRepo;
//	public void addItem(Item cloth)
//	{
//		String folder = "/omg/src/main/resources/image/";
//		byte[] bytes = null;
//		try {
//			bytes = cloth.getImage().getBytes();
//		} catch (IOException e) {
//			System.err.println("No Image Found");
//			e.printStackTrace();
//		}
//		saveImage(cloth.getImage());
//		Path path = Paths.get(folder + cloth.getName() + ".jpg");
//		try {
//			Files.write(path, bytes);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		clothRepo.save((Cloth)cloth);
//	}
//	
//	public void testImage(MultipartFile image)
//	{
//		byte[] bytes = null;
//		try {
//			bytes = image.getBytes();
//		} catch (IOException e) {
//			System.err.println("No Image Found");
//			e.printStackTrace();
//		}
//	}
//	
//	public void saveImage(MultipartFile image) {
//		String folder = "/omg/src/main/resources/image/";
//		byte[] bytes = null;
//		try {
//			bytes = image.getBytes();
//		} catch (IOException e) {
//			System.err.println("No Image Found");
//			e.printStackTrace();
//		}
//		Path path = Paths.get(folder + image.getName());
//		try {
//			Files.write(path, bytes);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	public void addCloth(RequestCloth reqCloth, MultipartFile image) {
		System.out.println(Contants.PRIYANKA);
//		Item cloth = new Cloth(reqCloth.);
		
	}

}
