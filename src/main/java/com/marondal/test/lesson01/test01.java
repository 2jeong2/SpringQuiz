package com.marondal.test.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/test01")
public class test01 {

	@RequestMapping("/1")
	public String print() {
		return "<h1>테스트 프로젝트 완성</h1>  <h3>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.</h3>";
	}
	
	@RequestMapping("/2")
	public Map<String,Integer> printScore(){
		Map<String,Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		
		return map ;
	}
	
}
