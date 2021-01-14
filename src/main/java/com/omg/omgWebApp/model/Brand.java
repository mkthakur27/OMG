package com.omg.omgWebApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Brand {

	private int id;
	private String name;
	private String imgPath;
	private String logoImgPath;
	Brand(String name)
	{
		this.name = name;
	}
}
