package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrimeMinister {
	@Value("Narendra Modi")
	private String name;
	@Value("70")
	private int age;
	@Autowired
	private States state;
	@Value("BA")
	private String education;
	@Autowired
	private Salary salary;
	@Value("BJP")
	private String party;

	public PrimeMinister() {
   System.out.println("minister");
	}
  
	public PrimeMinister(String name, int age, States state, String education, Salary salary, String party) {
		super();
		this.name = name;
		this.age = age;
		this.state = state;
		this.education = education;
		this.salary = salary;
		this.party = party;
	}

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + ", state=" + state + ", education=" + education
				+ ", salary=" + salary + ", party=" + party + "]";
	}

}
