package com.lwm.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;

import com.lwm.mybatis.beans.UserBean;

public interface UserMapper {

	/**
	 * 新增用户
	 */
	public int insertUser(UserBean user) throws Exception;
	
	/**
	 * 修改用户
	 */
	
	public int updateUser(UserBean user, int id) throws Exception;
	
	/**
	 * 删除用户
	 */
	public int deleteUser(int id) throws Exception;
	
	/**
	 * 根据id查询用户信息
	 */
	public UserBean selectUserById(int id) throws Exception;
	
	/**
	 * 查询所有的用户信息
	 */
	public List<UserBean> selectAllUser() throws Exception;
	
	/**
	 * 批量添加
	 */
	public int batchAddUsers(@Param("users") List<UserBean> list) throws Exception;
	
	/**
	 * 批量删除
	 */
	public int batchDeleteUsers(@Param("ids") List<Integer> list) throws Exception;
	
	public List<UserBean> pageUsers(Map<String, Object> params) throws Exception;
	
	public int countUser(Map<String, Object> params) throws Exception;
}
