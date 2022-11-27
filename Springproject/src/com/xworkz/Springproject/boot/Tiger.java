package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tiger {
	@Autowired
	private String tigerColor;
	@Autowired
	private int lifeSpan;
	
	public Tiger() {
		System.out.println("tiger");
	}
	public String getTigerColor() {
		return tigerColor;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
}
