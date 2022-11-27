package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Professor {
@Autowired
private String nameProfessor;
@Autowired
private String spealization;

public Professor() {
	System.out.println("professor");
}
public String getNameProfessor() {
	return nameProfessor;
}
public String getSpealization() {
	return spealization;
}
}
