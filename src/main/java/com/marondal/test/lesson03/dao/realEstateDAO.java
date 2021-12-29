package com.marondal.test.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.test.lesson03.modal.realEstate;

@Repository
public interface realEstateDAO {
	
	
	public realEstate selectRealEstate(@Param("id")int id);
	
	public List<realEstate> selectRentPrice(@Param("rentPrice")int rentPrice);
	
	public List<realEstate> selectAreaPrice(@Param("area")int area,@Param("price")int price);
	
}
