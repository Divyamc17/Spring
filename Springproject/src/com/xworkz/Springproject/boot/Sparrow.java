package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sparrow {
	@Autowired
	private String sparrowColor;
	@Autowired
	private int sparrowLifeSpan;
	
	public String getSparrowColor() {
		return sparrowColor;
	}
	public int getSparrowLifeSpan() {
		return sparrowLifeSpan;
	}

}
