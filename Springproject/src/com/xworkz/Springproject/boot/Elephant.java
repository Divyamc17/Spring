package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Elephant {
	@Autowired
	private String elephantColor;
	@Autowired
	private int elephantLifeSpan;
	
	public String getElephantColor() {
		return elephantColor;
	}
	public int getElephantLifeSpan() {
		return elephantLifeSpan;
	}

}
