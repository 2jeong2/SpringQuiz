package com.marondal.test.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.test.lesson03.dao.realEstateDAO;
import com.marondal.test.lesson03.modal.realEstate;

@Service
public class realEstateBO {
	
	@Autowired
	private realEstateDAO realEstateDAO;
	
	public realEstate getRealEstate(int id) {
		return realEstateDAO.selectRealEstate(id);
		
		
	}

}
