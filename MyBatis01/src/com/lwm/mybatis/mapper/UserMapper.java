package com.lwm.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

import com.lwm.mybatis.beans.UserBean;

public interface UserMapper {

	/**
	 * �����û�
	 */
	public int insertUser(UserBean user) throws Exception;
	
	/**
	 * �޸��û�
	 */
	
	public int updateUser(UserBean user, int id) throws Exception;
	
	/**
	 * ɾ���û�
	 */
	public int deleteUser(int id) throws Exception;
	
	/**
	 * ����id��ѯ�û���Ϣ
	 */
	public UserBean selectUserById(int id) throws Exception;
	
	/**
	 * ��ѯ���е��û���Ϣ
	 */
	public List<UserBean> selectAllUser() throws Exception;
	
	/**
	 * �������
	 */
	public int batchAddUsers(@Param("users") List<UserBean> list) throws Exception;
	
	/**
	 * ����ɾ��
	 */
	public int batchDeleteUsers(@Param("ids") List<Integer> list) throws Exception;
	
	public List<UserBean> pageUsers(Map<String, Object> params) throws Exception;
	
	public int countUser(Map<String, Object> params) throws Exception;
}
