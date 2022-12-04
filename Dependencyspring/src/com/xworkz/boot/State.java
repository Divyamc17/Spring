package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class State {
	@Value("Karnataka")
	private String name;
	@Value("6000000")
	private double population;
	@Value("Benaluru")
	private String capitalCity;
	@Value("30")
	private int noOfDistrict;
	@Value("Basavaraj Bommai")
	private String cmName;
	@Value("Kannada")
	private String primaryLanguage;
	
	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity + ", noOfDistrict="
				+ noOfDistrict + ", cmName=" + cmName + ", primaryLanguage=" + primaryLanguage + "]";
	}
	
	
	

}
