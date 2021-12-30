package com.marondal.test.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.marondal.test.lesson03.modal.realEstate;

@Repository
public interface realEstateDAO {
	
	
	public realEstate selectRealEstate(@Param("id")int id);
	
	public List<realEstate> selectRentPrice(@Param("rentPrice")int rentPrice);
	
	public List<realEstate> selectAreaPrice(@Param("area")int area,@Param("price")int price);
	
	public int insertRealEstate(realEstate realEstate);
	
	public int insertAsField(
			
			@Param("realtorId")int realtorId,
			@Param("address")String address,
			@Param("area")int area,
			@Param("type")String type,
			@Param("price")int price,
			@Param("rentPrice")int rentPrice
			) ;
	
	public int changeRealEstate(@Param("type")String type, @Param("price")int price);
	
	public int delRealEstate(@Param("id")int id);
	
}
