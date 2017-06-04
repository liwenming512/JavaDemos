package com.lwm.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lwm.mybatis.beans.KeyBean;

public interface KeyMapper {

	/**
	 * �������Կ��
	 * @return
	 * �ᳫ ����ʹ�� @Param("keys")
	 */
	
	public int batchSaveKeys(@Param("keys") List<KeyBean> keys);
}
