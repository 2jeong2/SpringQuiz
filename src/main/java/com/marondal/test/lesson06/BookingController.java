package com.marondal.test.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.test.lesson06.bo.BookingBO;
import com.marondal.test.lesson06.model.Booking;

@Controller	
public class BookingController {

	
	@Autowired
	BookingBO bookingBO;
	
	@GetMapping("/lesson06/test01")
	public String test01(Model model) {
		
		List<Booking> Booking = bookingBO.selectBO();
		
		model.addAttribute("Booking",Booking);
		
		return "lesson06/Booking";
	}
	
	@ResponseBody
	@GetMapping("/add_booking")
	public Map<String,String>addBooking(
			@RequestParam("name")String name,
			@RequestParam("date")String date,
			@RequestParam("day")int day,
			@RequestParam("headcount")int headcount,
			@RequestParam("phoneNumber")String phoneNumber,
			@RequestParam("state")String state
			){
		Map<String, String> map= new HashMap<>();
				
		int count = bookingBO.addBooking(name, date, day, headcount, phoneNumber,state);
		
		if(count == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		
		return map;
	}
	
	@GetMapping("/main")
	public String mainView() {
		return "lesson06/main";
		
	}
	
	@ResponseBody
	@GetMapping("/lookup")
	public Map<String, Object> lookup(
			@RequestParam("name")String name,
			@RequestParam("phoneNumber")String phoneNumber) {
		
		Map<String,Object> response = new HashMap<>();
		
		
		Booking booking = bookingBO.getBookingByNamePhoneNumber(name, phoneNumber);
		//조회된 데이터가 없으면 객체는 null
		
		if (booking == null) {
			response.put("result", "fail");
		}else {
			response.put("result", "success");
			response.put("booking", booking);
		}
		return response;
	}
	
	
}
