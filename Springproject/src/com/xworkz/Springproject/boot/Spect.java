package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Spect {
	
	@Autowired
	private String type;
	@Autowired
	private double price;
	
	public Spect() {
    System.out.println("default spect ");
	}
	
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
}
