package com.marondal.test.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marondal.test.lesson02.dao.reviewDAO;
import com.marondal.test.lesson02.model.review;


@Repository
public class reviewBO {

	@Autowired
	reviewDAO reviewDAO;
	
	public List<review> getReviewList(){
		return reviewDAO.selectReviewList();
	}
}
