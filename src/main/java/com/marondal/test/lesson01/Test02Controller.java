package com.marondal.test.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test02Controller {
	
	@RequestMapping("/lesson01/test03/1")
	public String test02() {
		return "lesson01/test02";
	}

}
