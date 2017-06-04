package com.lwm.mybatis.beans;

import java.io.Serializable;

public class PetBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public PetBean(){
		super();
	}
	
	public PetBean(Integer id, String name){
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "PetBean [id=" + id + ", name=" + name + "]";
	}
}
