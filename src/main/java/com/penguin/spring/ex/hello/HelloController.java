package com.penguin.spring.ex.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	
	@RequestMapping("/hello")
	// 같이 쓰는거임
	@ResponseBody
	public String helloworld() {
		return "HelloWorld";
	}
	
	
	
}
