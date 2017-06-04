package com.lwm.mybatis.mapper;

import com.lwm.mybatis.beans.HusbandBean;

public interface HusbandMapper {
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public HusbandBean selectHusbandById(int id) throws Exception;
	
	
	/**
	 * 
	 * @param id
	 * @return 
	 * @throws Exception
	 */
	public HusbandBean selectHusbandAndWife(int id) throws Exception;

}
