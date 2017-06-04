package com.lwm.mybatis.mapper;

import java.io.Serializable;

import com.lwm.mybatis.beans.WifeBean;

public interface WifeMapper extends Serializable {

	public WifeBean selectWifeByHusbandId(int id) throws Exception;
}
