package com.lwm.mybatis.mapper;

import com.lwm.mybatis.beans.CourseBean;

public interface CourseMapper {

    /**
     * 根据id查询课程
     * @param id
     * @return
     */
	public CourseBean findCourseById(int id);
	
    /**
     * 要求查课时，将选课的学生一并查出
     * @param id
     * @return
     */
	public CourseBean findCourseAndStudent(int id);
}
