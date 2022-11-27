package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Water {
	@Autowired
	private String waterColor;
	@Autowired
	private double boilingPoint;
	@Autowired
	private Ocean ocean;

	public Water() {
		System.out.println("water");
	}
	public void displayOcean() {
		System.out.println(ocean.getOceanName());
		System.out.println(ocean.getArea());
	}
	public String getWaterColor() {
		return waterColor;
	}
	public double getBoilingPoint() {
		return boilingPoint;
	}
}
