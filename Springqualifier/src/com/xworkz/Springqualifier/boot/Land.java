package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Land {
	
	private double area;
	private String siolType;
	@Value("500")
	private int noTress;
	
	public Land(@Value("2000.50")double area) {
		super();
		this.area = area;
	}
	@Value("Red")
	public void setSiolType(String siolType) {
		this.siolType = siolType;
	}
	@Override
	public String toString() {
		return "Land [area=" + area + ", siolType=" + siolType + ", noTress=" + noTress + "]";
	}
	

}
