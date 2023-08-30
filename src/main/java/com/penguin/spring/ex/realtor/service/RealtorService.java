package com.penguin.spring.ex.realtor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.ex.realtor.domain.Realtor;
import com.penguin.spring.ex.realtor.repository.RealtorRepository;

@Service
public class RealtorService {
	
	@Autowired
	private RealtorRepository realtorRepository;
	
	public int addRealtorByObject(Realtor realtor) {
		
		int count = realtorRepository.insertRealtorByObject(realtor);
		
		return count;
	}
}
