package com.marondal.test.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.test.lesson04.bo.SellerBO;
import com.marondal.test.lesson04.model.Seller;

@Controller
@RequestMapping("/lesson04")
public class SellerController {

	@Autowired
	private SellerBO sellerBO;
	
	@RequestMapping("/test01/1")
	public String addSeller() {
		return "lesson04/SellerAdd";
	}
	
	@ResponseBody
	@RequestMapping("/test01/add_seller")
	public String getseller(
				@RequestParam("nickname")String nickname,
				@RequestParam("profileImageUrl")String profileImageUrl,
				@RequestParam("temperature")double temperature
			) {
		 int count = sellerBO.insertSellerBO(nickname, profileImageUrl, temperature);
		 return "입력 성공 : " +  count;
	}
	
	@RequestMapping("/lesson04/test01/seller_info")
	public String sellerInfo() {
		return "lesson04/sellerInfo";
	}
	
	
	@RequestMapping("/test01/2")
	public String getUser(Model model) {
		Seller user = sellerBO.selectSeller(1);
		model.addAttribute("result",user);
		model.addAttribute("subject",user);
		
		
		return "lesson04/SellerAdd";
	
	}
	
	
}
