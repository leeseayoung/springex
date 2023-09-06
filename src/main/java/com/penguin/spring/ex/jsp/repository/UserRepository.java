package com.penguin.spring.ex.jsp.repository;

import java.util.List;

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
		
	public List<User> selectUserList();
	
	
	
	//9월 6일 수업
	//전달된 email과 일치하는 행의 개수를 얻어 오는기능
	public int selectCountEmail(@Param("email") String email);
	
}
