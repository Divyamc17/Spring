package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pg {
	@Autowired
	private String pgOwner;
	@Autowired
	private double pricePg;
	@Autowired
	private Mirror mirror;
	
public Pg() {
	System.out.println("pg");
}
public void displayMirror() {
	System.out.println(mirror.getLength());
	System.out.println(mirror.getWidth());
}
public String getPgOwner() {
	return pgOwner;
}
public double getPricePg() {
	return pricePg;
}
}
