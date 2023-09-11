package com.penguin.spring.ex.jpa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor
@Builder
@Getter
@Table(name="new_student")
@Entity
public class Student {

	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	//컬럼케이스로 정의된 컬럼일 경우 매칭
	@Column(name="phoneNumber")
	private String phoneNumber;
	private String email;
	
	@Column(name="dreamJob")
	private String dreamJob;
	
	// 자동으로 현재 시간 입력
	@UpdateTimestamp
	// update 될때는 수정되지 않는다.
	@Column(name="createdAT", updatable=false)
	private Date createdAT;
	@UpdateTimestamp
	@Column(name="updatedAT")
	private Date updatedAT;
	
	
	
}