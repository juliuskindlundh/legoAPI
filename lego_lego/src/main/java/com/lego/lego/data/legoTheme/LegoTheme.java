package com.lego.lego.data.legoTheme;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class LegoTheme {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	@Id
	int id;
	String name;
	int parent_id;
	
	public LegoThemeDTO toDTO() {
		return new LegoThemeDTO(this.id,this.name,this.parent_id);	
	}
}
