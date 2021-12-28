package com.marondal.test.lesson03;

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
		return realEstateBO.getRealEstate(5);
	}
	
}
