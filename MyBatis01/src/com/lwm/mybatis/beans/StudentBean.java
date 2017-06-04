package com.lwm.mybatis.beans;

import java.io.Serializable;
import java.util.List;

public class StudentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private List<CourseBean> courses;
	
	public StudentBean(){
		super();
	}
	
	public StudentBean(Integer id, String name, List<CourseBean> courses){
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
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
	public List<CourseBean> getList() {
		return courses;
	}
	public void setList(List<CourseBean> courses) {
		this.courses = courses;
	}
	@Override
	public String toString(){
        return "StudentBean [id=" + id + ", name=" + name + ", courses="
                + courses + "]";	
	}
}
