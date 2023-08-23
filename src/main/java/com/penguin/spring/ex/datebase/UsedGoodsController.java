package com.penguin.spring.ex.datebase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.penguin.spring.ex.datebase.domain.UsedGoods;
import com.penguin.spring.ex.datebase.service.UsedGoodsService;

// request, response 를 담당
@Controller
public class UsedGoodsController {
	
	@Autowired
	private UsedGoodsService usedGoodsService;
	
	// used goods 데이터 조회 걀과 json으로 response에 채운다
	@RequestMapping("/db/usedgoods/list")
	@ResponseBody
	public List<UsedGoods> usedGoodsList() {
		
		//컨트롤러가 데이터 얻음	response
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
	
		
		return usedGoodsList;
		
	}
	
	
	
}
