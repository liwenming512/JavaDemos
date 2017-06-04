package com.lwm.mybatis.service;

import org.apache.ibatis.session.SqlSession;

import com.lwm.mybatis.beans.HusbandBean;
import com.lwm.mybatis.mapper.HusbandMapper;
import com.lwm.mybatis.tools.DBTools;

public class OneToOneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectHusbandAndWife();
		selectHusbandById();
	}
	
	private static void selectHusbandAndWife(){
		SqlSession session = DBTools.getSession();
		HusbandMapper mapper = session.getMapper(HusbandMapper.class);
		try {
			HusbandBean husband = mapper.selectHusbandAndWife(1);
			System.out.println(husband);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}
	}
	
	private static void selectHusbandById(){
		SqlSession session = DBTools.getSession();
		HusbandMapper mapper = session.getMapper(HusbandMapper.class);
		try {
			HusbandBean husband = mapper.selectHusbandById(1);
			System.out.println(husband);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}
	}

}
