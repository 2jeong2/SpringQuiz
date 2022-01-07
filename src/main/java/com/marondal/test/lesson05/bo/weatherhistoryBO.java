package com.marondal.test.lesson05.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.test.lesson05.dao.weatherhistoryDAO;
import com.marondal.test.lesson05.model.weatherhistory;

@Service
public class weatherhistoryBO {
	
	@Autowired
	private weatherhistoryDAO weatherhistoryDAO;
	
	public List<weatherhistory> selectWeatherhistoryBO() {
		return weatherhistoryDAO.selectWeatherhistory();
	}
	
	public int insertWeatherBO(Date date, String weather, double temperatures, double precipitation, String microDust, double windSpeed){
		return weatherhistoryDAO.insertWeatherDAO(date, weather, temperatures, precipitation, microDust, windSpeed);
	}
}
