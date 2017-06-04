package com.lwm.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.lwm.mybatis.beans.LockBean;

public interface LockMapper {

	/**
	 * 添加锁
	 * @param lock
	 * @return
	 */
	public int saveLock(@Param("lock") LockBean lock);
	
	/**
	 * 根据ID查询锁的资料
	 * @param id
	 * @return
	 */
	public LockBean findLockById(int id);
	
	
	public LockBean findLockAndKeys(int id);
}
