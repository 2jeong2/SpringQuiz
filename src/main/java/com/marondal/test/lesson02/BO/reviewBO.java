package com.marondal.test.lesson02.BO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.marondal.test.lesson02.dao.reviewDAO;
import com.marondal.test.lesson02.model.review;

public class reviewBO {

	@Autowired
	private reviewDAO reviewDAO;
	
	public List<review> getReviewList(){
		return reviewDAO.selectReviewList();
	}
}
