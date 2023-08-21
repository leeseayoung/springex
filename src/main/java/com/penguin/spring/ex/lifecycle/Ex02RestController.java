package com.penguin.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + ResPonseBody(생략할수있다)
@RequestMapping("/lifecycle/ex01") // 공통으로 사용될경우 사용!!
public class Ex02RestController { 
	
	
	//직접 만든 클래스 객체 리턴
	@RequestMapping("/3")
	
	public Person objectResponse() {
		Person me = new Person("김인규", 31);
		
		return me;
	}
	
	// status code를 포함한 response
	// 200 OK 정상적으로 처리 했다(이건 에러 아님)
	// 404 Not Found : 페이지 없음 (주소 확인)
	// 405 Method Not Allow (메소드가 일치하지 않는다)
	// 400 Bad Request : 요청이 잘못됨 (파라미터 일치하지 않음)
	// 500 Internal Server Error : 서버 (자바 코드 확인)
	@RequestMapping("/4")
	
	public ResponseEntity<Person> entityResponse() {
		Person me = new Person("김인규", 31);
		
		ResponseEntity<Person> entity = new ResponseEntity(me, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
	
}