package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lion {
	@Autowired
	private String lionColor;
	@Autowired
	private int lionLifeSpan;
	
	 public String getLionColor() {
		return lionColor;
	}
	 public int getLionLifeSpan() {
		return lionLifeSpan;
	}
	

}
