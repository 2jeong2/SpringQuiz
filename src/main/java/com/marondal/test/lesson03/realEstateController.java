package com.marondal.test.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marondal.test.lesson03.bo.realEstateBO;
import com.marondal.test.lesson03.modal.realEstate;

@RequestMapping("/lesson03")
@RestController
public class realEstateController {

	@Autowired
	private realEstateBO realEstateBO;
	
	@RequestMapping("/test02/1")
	public realEstate test02(
			@RequestParam(value="id", required=false, defaultValue="5")int id
			
			) {
		return realEstateBO.getRealEstate(id);
	}
	
	@RequestMapping("/test02/2")
	public List<realEstate> test03(
			@RequestParam(value="rentPrice", required=false, defaultValue="100")int rentPrice) {
		
		return realEstateBO.getRentPrice(rentPrice);
	}
	
	@RequestMapping ("/test02/3")
	public List<realEstate> test04(
			@RequestParam(value="area", required=false, defaultValue="90")int area,
			@RequestParam(value="price", required=false, defaultValue="130000")int price
			) {
		
		return realEstateBO.getAreaPrice(area, price);
	}
	//package는 소문자로 시작 class는 대문자로 시작 개발자 국룰!
	
		
		 
	@RequestMapping("/test03/1")
	public String test05() {
		
		realEstate realEstate = new realEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateBO.addRealEstate(realEstate);
		return  "입력 성공 : " + count;
	}
	
	@RequestMapping("/test03/2")
	public String test06(@RequestParam("realtorId")int realtorId) {
		int row= realEstateBO.insertRealEstate(realtorId ,"썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
				 return "입력 성공 : "+ row;
	}
	
	@RequestMapping("/test03/3")
	public String test07() {
		int row1 = realEstateBO.changeRealestate("전세",70000);
		return "수정 성공  : " + row1;
		
	}
	//insert제외는 feild 쓰는 것을 추천하지 않음 (메모리 낭비) 객체 없이 ㅇ사용
	
	 @RequestMapping("/test03/4")
	  public String test08(@RequestParam("id")int id) {
	
		 int row2= realEstateBO.deleteRealEstate(id);
		 return "삭제 성공 : " + row2;
	 
	 }
	
}
