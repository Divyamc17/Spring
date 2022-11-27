package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class God {
	@Autowired
	private String godName;
	@Autowired
	private double height;
	
public God() {
	System.out.println("god");
}
public String getGodName() {
	return godName;
}
public double getHeight() {
	return height;
}
}
