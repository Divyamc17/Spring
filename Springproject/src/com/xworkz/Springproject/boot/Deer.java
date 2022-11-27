package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deer {
	@Autowired
	private String deerColor;
	@Autowired
	private int deerSpan;
	
	public String getDeerColor() {
		return deerColor;
	}
	public int getDeerSpan() {
		return deerSpan;
	}

}
