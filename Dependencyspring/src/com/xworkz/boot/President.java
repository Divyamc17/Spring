package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class President {
	@Autowired
	private Name presidentName;
	@Value("64")
	private int age;
	@Value("1.5")
	private double salary;
	@Value("2")
	private double expertise;
	@Value("BA")
	private String education;
	
	
	
	@Override
	public String toString() {
		return "President [presidentName=" + presidentName + ", age=" + age + ", salary=" + salary + ", expertise="
				+ expertise + ", education=" + education + "]";
	}
	
/*	public President() {
		System.out.println("president");
	}
	
	public President(String presidentName, int age, double salary, double expertise, String education) {
		super();
		this.presidentName = presidentName;
		this.age = age;
		this.salary = salary;
		this.expertise = expertise;
		this.education = education;
	}*/


	
	
	

}
