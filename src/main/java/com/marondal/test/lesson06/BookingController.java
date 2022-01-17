package com.marondal.test.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String test01() {
		return "lesson06/Booking";
	}
	
	@ResponseBody
	@GetMapping("/add_booking")
	public  Map<String,String>addBooking(
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

	@GetMapping("/lookup")
	public Booking lookup(@RequestParam("name")String name,
			@RequestParam("phoneNumber")String phoneNumber) {
		
		Booking booking = bookingBO.getBookingByNamePhoneNumber(name, phoneNumber);
		
		return booking;
	}
	
	
}
