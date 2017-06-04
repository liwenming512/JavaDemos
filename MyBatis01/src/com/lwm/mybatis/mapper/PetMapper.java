package com.lwm.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lwm.mybatis.beans.CatBean;
import com.lwm.mybatis.beans.DogBean;
import com.lwm.mybatis.beans.PetBean;

public interface PetMapper {

	public int saveCat(@Param("cat") CatBean cat);
	
	public int saveDog(@Param("dog") DogBean dog);
	
	public List<PetBean> findAllPet();
	
	public List<CatBean> findAllCat();
}
