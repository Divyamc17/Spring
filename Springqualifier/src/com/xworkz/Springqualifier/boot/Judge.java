package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Judge {
	
	private String name;
	private int age;
	private int experience;
	@Autowired
	private String type;
	@Autowired
	private String education;
	
	
	public Judge(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//@Value("60")
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Judge [name=" + name + ", age=" + age + ", experience=" + experience + ", type=" + type + ", education="
				+ education + "]";
	}
	

}
