package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cloth {
	@Autowired
	private String clothType;
	@Autowired
	private double clothPrice;
	@Autowired
	private Cotton cotton;
	
	public Cloth() {
		System.out.println("cloth");
	}
	public void displayCotton() {
		System.out.println(cotton.getColor());
		System.out.println(cotton.getSeason());
	}
	public String getClothType() {
		return clothType;
	}
	public double getClothPrice() {
		return clothPrice;
	}

}
