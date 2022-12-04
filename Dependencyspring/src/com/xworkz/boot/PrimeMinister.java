package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PrimeMinister {
	@Value("Narendra Modi")
	private String name;
	@Value("70")
	private int age;
	@Value("Gujarath")
	private State state;
	@Value("BA")
	private String education;
	@Value("2 lakh")
	private Salary salary;
	@Value("BJP")
	private String party;
	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + ", state=" + state + ", education=" + education
				+ ", salary=" + salary + ", party=" + party + "]";
	}
	

}
