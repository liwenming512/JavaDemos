package com.lwm.mybatis.beans;

import java.io.Serializable;
import java.util.List;

/**
* @ClassName: CourseBean 
* @Description: ¶à¶Ô¶à
* @author A18ccms a18ccms_gmail_com 
* @date Jan 1, 2017 10:56:11 PM 
*
 */

public class CourseBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private List<StudentBean> students;
	
	public CourseBean(){
		super();
	}
	
	public CourseBean(int id, String name, List<StudentBean> students){
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

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

	public List<StudentBean> getStudents() {
		return students;
	}

	public void setStudents(List<StudentBean> students) {
		this.students = students;
	}
	
	@Override
	public String toString(){
        return "CoursesBean [id=" + id + ", name=" + name + ", student=" + students + "]";
	}
}
