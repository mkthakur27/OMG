package com.omg.omgWebApp.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.omg.omgWebApp.constant.Contants;

@Component
public class SaveImageUtil {

	public String saveImage(String imgName,MultipartFile imageFile)
	{
		Path path = Paths.get(Contants.PATH_FOR_IMAGE + imgName +Contants.IMG_EXT_JPG);
		Path pathToShow = Paths.get(Contants.PATH_FOR_SAVE + imgName +Contants.IMG_EXT_JPG);
		save(path,imageFile);
		return pathToShow.toString();
	}
	
	private void save(Path path,MultipartFile imageFile) {
		byte[] bytes = null;
		try {
			bytes = imageFile.getBytes();
		} catch (IOException e) {
			System.err.println("No Image Found");
			e.printStackTrace();
		}
		try {
			Files.write(path, bytes);
		} catch (IOException e) {
			System.err.println("Problem in adding file to path " + e.getMessage());
			e.printStackTrace();
		}
	}
}
