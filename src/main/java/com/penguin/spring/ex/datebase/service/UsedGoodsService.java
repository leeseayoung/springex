package com.penguin.spring.ex.datebase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.ex.datebase.domain.UsedGoods;
import com.penguin.spring.ex.datebase.repository.UsedGoodsRepository;

// 로직 (business) 담당
@Service
public class UsedGoodsService {
	
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	
	// usedGoods 모든 데이터 조회
	public List<UsedGoods> getUsedGoodsList() {
		
		
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();	
		return usedGoodsList;
		
	}
	
	
	
	
}
