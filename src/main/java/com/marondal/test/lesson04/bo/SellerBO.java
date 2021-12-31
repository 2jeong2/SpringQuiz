package com.marondal.test.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.test.lesson04.dao.SellerDAO;
import com.marondal.test.lesson04.model.Seller;

@Service
public class SellerBO {

	
	@Autowired
	private SellerDAO sellerDAO;
	
	public int insertSellerBO(String nickname, String profileImageUrl, double temperature) {
		return sellerDAO.insertSellerDAO(nickname, profileImageUrl, temperature);
	} 
	
	public Seller selectSeller(int id) {
		return sellerDAO.selectSellerDAO(id);
	}
}