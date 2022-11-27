package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Crow {
	@Autowired
	private String crowColor;
	@Autowired
	private int crowSpan;
	
	public String getCrowColor() {
		return crowColor;
	}
	public int getCrowSpan() {
		return crowSpan;
	}

}
