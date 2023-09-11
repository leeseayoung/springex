package com.penguin.spring.ex.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.ex.jpa.domain.Student;

@Controller
public class StudentController {

	@GetMapping("/lombok/test")
	@ResponseBody
	public Student lombokTest() {
		
		
//		Student student = new Student();
//		student.setName("김인규");
//		student.setDreamJob("개발자");
//		student.setPhoneNumber("010-1234-5678");
		
		
		//빌더 패턴?
		Student student = Student.builder()
		.name("김인규")
		.dreamJob("웹개발자")
		.phoneNumber("010-1234-1234")
		.build();
		
		
		
		
		
		
		return student;
		
	}
	
	
}
