package com.lwm.mybatis.mapper;

import com.lwm.mybatis.beans.StudentBean;

public interface StudentMapper {
	
    /**
     * ����idֵ��ѯѧ����Ϣ
     * @param id
     * @return
     */
	public StudentBean findStudnetById(int id);
	
    /**
     * Ҫ���ѯѧ��ʱ����ѧ��ѡ��Ŀγ̲��
     * @param id
     * @return
     */
	public StudentBean findStudentAndCourses(int id);
}
