package com.penguin.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.ex.mybatis.domain.Review;

@Repository
public interface ReviewRepository {

	//id가 3인 리뷰 데이터 조회 		
	// 파라미터로 전달된 id와 일피하는 한 행의 리뷰정보 조회
	public Review selectReview(@Param("id") int id); 
		
	
	
	
	
}
