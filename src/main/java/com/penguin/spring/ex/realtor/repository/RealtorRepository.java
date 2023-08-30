package com.penguin.spring.ex.realtor.repository;

import org.springframework.stereotype.Repository;

import com.penguin.spring.ex.realtor.domain.Realtor;

@Repository
public interface RealtorRepository {

	
	
	public int insertRealtorByObject(Realtor realtor);
}
