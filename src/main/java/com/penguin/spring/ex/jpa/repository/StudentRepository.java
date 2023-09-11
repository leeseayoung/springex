package com.penguin.spring.ex.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.penguin.spring.ex.jpa.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> { 


	
	

}

