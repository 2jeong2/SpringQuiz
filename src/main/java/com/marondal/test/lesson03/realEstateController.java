package com.marondal.test.lesson03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marondal.test.lesson03.bo.realEstateBO;
import com.marondal.test.lesson03.modal.realEstate;

@RestController
public class realEstateController {

	@Autowired
	private realEstateBO realEstateBO;
	
	@RequestMapping("/lesson03/test02/1")
	public realEstate test02(
			@RequestParam(value="id", required=false, defaultValue="5")int id
			
			) {
		return realEstateBO.getRealEstate(id);
	}
	
	@RequestMapping("/lesson03/test02/2")
	public List<realEstate> test03(
			@RequestParam(value="rentPrice", required=false, defaultValue="100")int rentPrice) {
		
		return realEstateBO.getRentPrice(rentPrice);
	}
	
	@RequestMapping ("/lesson03/test02/3")
	public List<realEstate> test04(
			@RequestParam(value="area", required=false, defaultValue="90")int area,
			@RequestParam(value="price", required=false, defaultValue="130000")int price
			) {
		
		return realEstateBO.getAreaPrice(area, price);
	}
	//package는 소문자로 시작 class는 대문자로 시작 개발자 국룰!
	
}
