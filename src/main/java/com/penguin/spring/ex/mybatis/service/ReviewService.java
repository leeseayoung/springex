package com.penguin.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.ex.mybatis.domain.Review;
import com.penguin.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	//id가 3인 리뷰 정보 조회
	//파라미터로 전달 받은 id가 일치하는 리뷰 정보 조회
	//
	public Review getReview(int id) {
		//밑에 기능
		 Review review = reviewRepository.selectReview(id);
		 
		 return review;
	}
	
}
