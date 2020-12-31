package com.omg.omgWebApp.model;

import org.springframework.web.multipart.MultipartFile;

public interface Item {
	public String getName();
	public double getPrice();
	public int getTypeId();
	public String getImgPath();
	public void setImgPath(String path);
	public MultipartFile getImage();
	public void setImage(MultipartFile image);
}
