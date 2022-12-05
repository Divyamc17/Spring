package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VicePresident extends President {
	
	@Value("Jagadeep Dhankhar")
	private String vicePresidentName;
	
	/*public VicePresident() {
		System.out.println("vice");
	}

	public VicePresident(String presidentName, int age, double salary, double expertise, String education) {
		super(presidentName, age, salary, expertise, education);
	}*/

}
