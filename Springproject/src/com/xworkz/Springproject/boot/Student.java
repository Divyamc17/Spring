package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
@Autowired	
 private String hesaru;
@Autowired
 private int standard;

public Student() {
	System.out.println("student");
}
public String getHesaru() {
	return hesaru;
}
public int getStandard() {
	return standard;
}
}
