package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mirror {
	@Autowired
	private double length;
	@Autowired
	private double width;
	
	public Mirror() {
		System.out.println("mirror");
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}

}
