package com.marondal.test.lesson05.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.test.lesson05.model.weatherhistory;

@Repository
public interface weatherhistoryDAO {
	
	public List<weatherhistory> selectWeatherhistory();
	
	public int insertWeatherDAO(
			@Param("date")Date date, 
			@Param("weather")String weather, 
			@Param("temperatures")double temperatures, 
			@Param("precipitation")double precipitation, 
			@Param("microDust")String microDust, 
			@Param("windSpeed")double windSpeed);
}
