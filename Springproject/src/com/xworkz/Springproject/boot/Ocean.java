package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean {
	@Autowired
	private String oceanName;
	@Autowired
	private double area;
 
	public Ocean() {
		System.out.println("ocean");
	}
	public String getOceanName() {
		return oceanName;
	}
	public double getArea() {
		return area;
	}
}
