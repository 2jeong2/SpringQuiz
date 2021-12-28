package com.marondal.test.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.test.lesson03.modal.realEstate;

@Repository
public interface realEstateDAO {
	
	
	public realEstate selectRealEstate(@Param("id")int id);
}
