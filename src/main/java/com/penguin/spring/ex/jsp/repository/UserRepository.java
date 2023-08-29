package com.penguin.spring.ex.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.penguin.spring.ex.jsp.domain.User;

@Repository
public interface UserRepository {

	public int insertUser(
			@Param("name") String name
			, @Param("yyyymmdd") String yyyymmdd
			, @Param("hobby") String hobby
			, @Param("email") String email
			);
	
	public int insertUserByObject(User user);
	
	
	
	public User selectLastUser();
		
	
	
}
