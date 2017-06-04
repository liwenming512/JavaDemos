package com.lwm.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.lwm.mybatis.beans.LockBean;

public interface LockMapper {

	/**
	 * �����
	 * @param lock
	 * @return
	 */
	public int saveLock(@Param("lock") LockBean lock);
	
	/**
	 * ����ID��ѯ��������
	 * @param id
	 * @return
	 */
	public LockBean findLockById(int id);
	
	
	public LockBean findLockAndKeys(int id);
}
