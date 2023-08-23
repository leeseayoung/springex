package com.penguin.spring.ex.datebase.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.penguin.spring.ex.datebase.domain.UsedGoods;

// Mybatis 프레임워크
// 데이터 베이스 담당
// 퀴리 수행
@Repository
public interface UsedGoodsRepository {

	
	//used_goods 데이터 모든행 조회  
	public List<UsedGoods> selectUsedGoodsList();
		
	
	
}
