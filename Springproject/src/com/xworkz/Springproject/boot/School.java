package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
@Autowired
private String schoolName;
@Autowired
private double fees;
@Autowired
private Student student;

public School() {
	System.out.println("school");
}
public void displayStudent() {
	System.out.println(student.getHesaru());
	System.out.println(student.getStandard());

}
public String getSchoolName() {
	return schoolName;
}
public double getFees() {
	return fees;
} 
}
