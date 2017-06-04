package com.lwm.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lwm.mybatis.beans.UserBean;
import com.lwm.mybatis.mapper.UserMapper;
import com.lwm.mybatis.tools.DBTools;

public class UserService {
	
	public static void main(String[] args){
//		insertUser();
//		selectUserById();
//		selectAllUser();
//		deleteUser();
		batchAddUsers();
		countUser();
		pageUser();
		batchDeleteUsers();
		pageUser();
		countUser();
	}

	private static void insertUser(){
		SqlSession session = DBTools.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		UserBean user = new UserBean("ܲ", "1314520", 7000.0);
		try {
			userMapper.insertUser(user);
			System.out.println(user.toString());
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}
	}
	
	private static void deleteUser(){
		SqlSession session = DBTools.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		try {
			userMapper.deleteUser(4);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}
	}
	
	private static void selectUserById(){
		SqlSession session = DBTools.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		try {
			UserBean user = userMapper.selectUserById(5);
			System.out.println(user.toString());
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void selectAllUser(){
		SqlSession session = DBTools.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		try {
			List<UserBean> users = userMapper.selectAllUser();
			System.out.println(users.toString());
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void batchAddUsers(){
		SqlSession session = DBTools.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		List<UserBean> users = new ArrayList<UserBean>();
		for (int i = 0; i < 20; i++) {
			UserBean user = new UserBean("liwm" + i, "123456", 100000.0);
			users.add(user);
		}
		try {
			userMapper.batchAddUsers(users);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}
	}
	
	private static void batchDeleteUsers(){
		SqlSession session = DBTools.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		ArrayList<Integer> ids = new ArrayList<Integer>();
		for (int i = 68; i < 88; i++) {
			ids.add(i);
		}
		try {
			userMapper.batchDeleteUsers(ids);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}
	}
	
	private static void pageUser() {
		SqlSession session = DBTools.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", "liwm");
		map.put("index", 1);
		map.put("pageSize", 5);
		try {
			List<UserBean> users = userMapper.pageUsers(map);
			for (UserBean user : users) {
				System.out.println(user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void countUser(){
		SqlSession session = DBTools.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", "liwm");
		try {
			int count = userMapper.countUser(map);
			System.out.println(count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
