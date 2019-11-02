package com.han.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private Double score;
	
	public Student() {
		super();
	}
	
	

}
