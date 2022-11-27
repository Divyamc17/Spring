package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Singer {
@Autowired	
 private String name;
@Autowired
private int age;

public Singer() {
	System.out.println("created singer");
}
 
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
}
