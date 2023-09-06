package com.penguin.spring.ex.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.ex.jsp.domain.User;
import com.penguin.spring.ex.jsp.service.UserService;

@RequestMapping("/ajax/user")
@Controller
public class NewUserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public String userList(Model model) {
		
		List<User> userList = userService.getUserList();
		model.addAttribute("userList", userList);
		
		
		
		return "ajax/user/list";
	}
	
	
	
	@ResponseBody
	@GetMapping("/create")
	public Map<String, String> createUser(
			@RequestParam("name")String name
			, @RequestParam("birthday") String yyyymmdd
			, @RequestParam("hobby") String hobby
			, @RequestParam("email") String email) {
		
		int count = userService.addUser(name, yyyymmdd, hobby, email);
		
		// 성공 실패 여부
		// 성공 : {"result : success}
		// 실패 : {"result : fali"}
		Map <String, String> resultMap = new HashMap<>();
		if(count == 1) {//성공
			resultMap.put("result", "success");
			
		} else { // 실패
			resultMap.put("result", "fail");
			
		}
		
		return resultMap;
	}
	
	@GetMapping("/input")
	public String userInput() {
		
		return "ajax/user/input";
	}
	
	
	
	
	
	
	
}

