package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Institute {
	@Value("x-workz")
	private String name;
	private double fees;
	private int noStudents;
	
	
	public Institute(@Value("24000") double fees) {
		super();
		this.fees = fees;
	}
	@Value("100")
	public void setNoStudents(int noStudents) {
		this.noStudents = noStudents;
	}
	@Override
	public String toString() {
		return "Institute [name=" + name + ", fees=" + fees + ", noStudents=" + noStudents + "]";
	}
	
	
	

}
