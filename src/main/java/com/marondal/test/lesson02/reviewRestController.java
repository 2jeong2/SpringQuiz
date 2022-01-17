package com.marondal.test.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marondal.test.lesson02.bo.reviewBO;
import com.marondal.test.lesson02.model.review;

@RestController
public class reviewRestController {

	@Autowired
	reviewBO reviewBO;
	
	@RequestMapping("/lesson02/test01")
	public List<review> test01() {
		return reviewBO.getReviewList();
	}
}
