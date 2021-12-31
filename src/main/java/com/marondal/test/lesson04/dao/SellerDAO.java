package com.marondal.test.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.test.lesson04.model.Seller;



@Repository
public interface SellerDAO {

	public int insertSellerDAO(
			@Param("nickname")String nickname,
			@Param("profileImageUrl")String profileImageUrl, 
			@Param("temperature")double temperature);
	
	
	public Seller selectSellerDAO(@Param("id")int id);
}

