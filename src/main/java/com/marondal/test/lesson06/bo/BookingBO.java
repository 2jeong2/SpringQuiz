package com.marondal.test.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.test.lesson06.dao.BookingDAO;
import com.marondal.test.lesson06.model.Booking;

@Service
public class BookingBO {

	@Autowired
	BookingDAO bookingDao;
	
	public List<Booking> selectBO() {
		return bookingDao.selectBooking();
	}
	public String addBooking(String name, String date, int day, int headcount, String phoneNumber,String state) {
		return bookingDao.insertBooking(name,date,day,headcount,phoneNumber,"대기중");
	}
	
	public Booking getBookingByNamePhoneNumber(String name, String phoneNumber) {
		return bookingDao.selectBookingByNamePhoneNumber(name, phoneNumber);
	}
	
}
