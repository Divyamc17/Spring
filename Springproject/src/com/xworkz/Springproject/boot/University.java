package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class University {

@Autowired
private String universityName;
@Autowired
private String place;
@ Autowired
private Professor professer;

public University() {
	System.out.println("university");
}
public void displayProfessor() {
	System.out.println(professer.getNameProfessor());
	System.out.println(professer.getSpealization());
}

public String getUniversityName() {
	return universityName;
}
public String getPlace() {
	return place;
}
}
