package com.lwm.mybatis.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lwm.mybatis.beans.KeyBean;
import com.lwm.mybatis.beans.LockBean;
import com.lwm.mybatis.mapper.KeyMapper;
import com.lwm.mybatis.mapper.LockMapper;
import com.lwm.mybatis.tools.DBTools;

public class OneToManyService {
	
	public static void main(String[] args){
		saveLock();
		batchSaveKeys();
		findLockAndKeys();
	}
	
	private static void findLockAndKeys(){
		SqlSession session = DBTools.getSession();
		LockMapper mapper = session.getMapper(LockMapper.class);
		LockBean lock = mapper.findLockAndKeys(1);
		System.out.println(lock);
	}
	
	private static void batchSaveKeys(){
		SqlSession session = DBTools.getSession();
		LockMapper lockMapper = session.getMapper(LockMapper.class);
		KeyMapper keyMapper = session.getMapper(KeyMapper.class);
		
		LockBean lock = lockMapper.findLockById(1);
		List<KeyBean> keys = new ArrayList<KeyBean>();
		for (int i = 0; i < 5; i++){
			KeyBean key = new KeyBean(null, "Ô¿³×"+i, lock);
			keys.add(key);
		}
		keyMapper.batchSaveKeys(keys);
		session.commit();
	}
	
	private static void saveLock(){
		SqlSession session = DBTools.getSession();
		LockMapper lockMapper = session.getMapper(LockMapper.class);
		LockBean lock = new LockBean(null, "Ëø1", null);
		lockMapper.saveLock(lock);
		session.commit();
	}
	
}
