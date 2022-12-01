package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Priest {
	
	private String name;
	private int age;
    @Autowired
	//@Qualifier("salary")
	private double salary;
	private boolean married;
	private double weight;
	
	
	public Priest(String name, int age, boolean married) {
		super();
		this.name = name;
		this.age = age;
		this.married = married;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Priest [name=" + name + ", age=" + age + ", salary=" + salary + ", married=" + married + ", weight="
				+ weight + "]";
	}
	
}
