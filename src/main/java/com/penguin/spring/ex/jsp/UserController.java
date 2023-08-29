package com.penguin.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.ex.jsp.domain.User;
import com.penguin.spring.ex.jsp.service.UserService;

@RequestMapping("/jsp/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	//이름, 생년월일, 이메일(취미), 전달 받고 사용자 정보 저장하는기능
	//@RequestMapping("/jsp/user/create", method=RequestMethod.GET)
	@GetMapping("/create")
//	@ResponseBody
	public String createUser(
			@RequestParam("name") String name
			, @RequestParam("yyyymmdd") String yyyymmdd
			, @RequestParam("hobby")String hobby
			, @RequestParam("email")String email
			, Model model) {
		
		//int count = userService.addUser(name, yyyymmdd, hobby, email);
		
		User user = new User();
		user.setName(name);
		user.setYyyymmdd(yyyymmdd);
		user.setHobby(hobby);
		user.setEmail(email);
		
		
		int count = userService.addUserByObject(user);
		
		model.addAttribute("result", user);
		
		return "jsp/userInfo";
		//return "수행 결과 : " + count; 
	}
	
	@GetMapping("/input")
	public String inputUser() {
		
		return "jsp/userinput";
		
		
	}
	
	
	
	@GetMapping("/last")
	public String lastUser(Model model) {
		
		User user = userService.getLastUser();
		 					//키       벨류
		model.addAttribute("result", user);	
		
		//여기서 데이터 조회해가지고 와야됨
		
		return "jsp/userInfo";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
