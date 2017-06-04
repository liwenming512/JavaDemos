package com.lwm.mybatis.service;

import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lwm.mybatis.beans.CatBean;
import com.lwm.mybatis.beans.DogBean;
import com.lwm.mybatis.beans.PetBean;
import com.lwm.mybatis.mapper.PetMapper;
import com.lwm.mybatis.tools.DBTools;

public class ExtendsService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveCat();
		saveDog();
		findAllPet();
		findAllCat();
	}

	private static void saveCat(){
		SqlSession session = DBTools.getSession();
		PetMapper mapper = session.getMapper(PetMapper.class);
		CatBean cat = new CatBean(null, "´óÁ³Ã¨");
		cat.setFish(10);
		mapper.saveCat(cat);
		session.commit();
	}
	
	private static void saveDog(){
		SqlSession session = DBTools.getSession();
		PetMapper mapper = session.getMapper(PetMapper.class);
		DogBean dog = new DogBean(null, "¹þÊ¿Ææ");
		dog.setBone(10);
		mapper.saveDog(dog);
		session.commit();
	}
	
	private static void findAllPet(){
		SqlSession session = DBTools.getSession();
		PetMapper mapper = session.getMapper(PetMapper.class);
		List<PetBean> pets = mapper.findAllPet();
		for (PetBean pet : pets) {
			System.out.println(pet);
		}
	}
	
	private static void findAllCat(){
		SqlSession session = DBTools.getSession();
		PetMapper mapper = session.getMapper(PetMapper.class);
		List<CatBean> cats = mapper.findAllCat();
		for (CatBean cat : cats) {
			System.out.println(cat);
		}
	}
}
