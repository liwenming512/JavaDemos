package com.lwm.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.lwm.mybatis.beans.CourseBean;
import com.lwm.mybatis.beans.StudentBean;
import com.lwm.mybatis.mapper.CourseMapper;
import com.lwm.mybatis.mapper.StudentMapper;
import com.lwm.mybatis.tools.DBTools;

public class ManyToManyService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findCourseAndStudent();
		findStudentAndCourse();
	}
	
	private static void findStudentAndCourse(){
		SqlSession session = DBTools.getSession();
		CourseMapper mapper = session.getMapper(CourseMapper.class);
		CourseBean course = mapper.findCourseAndStudent(2);
		System.out.println(course);
	}
	
	private static void findCourseAndStudent(){
		SqlSession session = DBTools.getSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		StudentBean student = mapper.findStudentAndCourses(1);
		System.out.println(student);
	}

}
