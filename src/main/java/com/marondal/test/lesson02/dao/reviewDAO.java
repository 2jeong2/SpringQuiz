package com.marondal.test.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.marondal.test.lesson02.model.review;

@Repository
public interface reviewDAO {

	public List<review> selectReviewList();
}
