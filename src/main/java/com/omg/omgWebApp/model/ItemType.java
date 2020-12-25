package com.omg.omgWebApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class ItemType {
	
	@Id
	@Column(name="type_id")
	private int id;
	@Column(name="type_name")
	private String type;
	public ItemType(String type)
	{
		this.type = type;
	}
}
