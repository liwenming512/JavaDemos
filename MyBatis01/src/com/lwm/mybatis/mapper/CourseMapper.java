package com.lwm.mybatis.mapper;

import com.lwm.mybatis.beans.CourseBean;

public interface CourseMapper {

    /**
     * ����id��ѯ�γ�
     * @param id
     * @return
     */
	public CourseBean findCourseById(int id);
	
    /**
     * Ҫ����ʱ����ѡ�ε�ѧ��һ�����
     * @param id
     * @return
     */
	public CourseBean findCourseAndStudent(int id);
}
