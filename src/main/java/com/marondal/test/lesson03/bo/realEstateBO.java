package com.marondal.test.lesson03.bo;

import java.util.List;

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
	
	public List<realEstate> getRentPrice(int rentPrice) {
		return realEstateDAO.selectRentPrice(rentPrice);
	}

	public List<realEstate> getAreaPrice(int area, int price) {
		return realEstateDAO.selectAreaPrice(area, price);
	}
	
	public int addRealEstate(realEstate realEstate) {
		return realEstateDAO.insertRealEstate(realEstate);
	}
	
	public int insertRealEstate(int realtorId, String address, int area, String type, int price, int rentPrice) {
		return  realEstateDAO.insertAsField(realtorId, address, area, type, price, rentPrice);
	}
	
	public int changeRealestate(String type, int price) {
		return realEstateDAO.changeRealEstate(type, price);
	}
	
	public int deleteRealEstate(int id) {
		return realEstateDAO.delRealEstate(id);
	}
	
	
}
