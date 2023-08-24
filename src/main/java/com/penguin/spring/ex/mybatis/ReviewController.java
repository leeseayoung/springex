package com.penguin.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.ex.mybatis.domain.Review;
import com.penguin.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	// 리퀘스트 파라미터로 전달된 id와 일피치하는 리뷰 정보를 json으로 response에 담는다
	// 서버에서 요청하는 id
	@RequestMapping("/mybatis/review")
	@ResponseBody
	// request.getParameter("");
	// 로컬8080/mybatis/review?id=8 로 조회 해야한다!
	public Review review(@RequestParam("id") int id) {
		Review review = reviewService.getReview(id);
		
		return review;
	}
	
	
}
