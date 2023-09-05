package com.penguin.spring.ex.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin.spring.ex.jsp.domain.User;
import com.penguin.spring.ex.jsp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public int addUser(String name, String yyyymmdd, String hobby, String email) {
		
		int count = userRepository.insertUser(name, yyyymmdd, hobby, email);
		
		return count;
		
	}

	
	public int addUser1(String name, String yyyymmdd, String hobby, String email) {
		
		int count = userRepository.insertUser(name, yyyymmdd, hobby, email);
		
		return count;
		
	}
	
	
	
	public int addUserByObject(User user) {
		
		int count = userRepository.insertUserByObject(user);
		
		return count;
		
	}
	
	
	public User getLastUser() {
			
		User user = userRepository.selectLastUser();
	
		
		return user;
	}
	
	
	public List<User> getUserList() {
		
		List<User> userList = userRepository.selectUserList();
		
		return userList;
		
	}
	
	
	
}
