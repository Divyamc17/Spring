package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bear {
	@Autowired
	private String bearColor;
	@Autowired
	private int bearLifeSpan;
	
	public String getBearColor() {
		return bearColor;
	}
	public int getBearLifeSpan() {
		return bearLifeSpan;
	}

}
