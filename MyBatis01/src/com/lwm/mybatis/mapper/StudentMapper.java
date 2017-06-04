package com.lwm.mybatis.mapper;

import com.lwm.mybatis.beans.StudentBean;

public interface StudentMapper {
	
    /**
     * 根据id值查询学生信息
     * @param id
     * @return
     */
	public StudentBean findStudnetById(int id);
	
    /**
     * 要求查询学生时，将学生选择的课程查出
     * @param id
     * @return
     */
	public StudentBean findStudentAndCourses(int id);
}
