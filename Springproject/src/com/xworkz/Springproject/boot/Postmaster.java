package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Postmaster {
@Autowired
	private String postmanName;
@Autowired
	private double salary;
public Postmaster() {
	System.out.println("postmaster");
}
public String getPostmanName() {
	return postmanName;
}
public double getSalary() {
	return salary;
}
}
