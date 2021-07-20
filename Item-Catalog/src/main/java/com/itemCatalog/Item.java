package com.itemCatalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id; 
	private String name;
	
	
	public Item(String name) {
		this.name = name;
	}
	
}
