package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {
	@Value("Bengaluru")
	private String name;
	@Value("true")
	private boolean capital;

	public City() {
		System.out.println("city");
	}
	
	public City(String name, boolean capital) {
		super();
		this.name = name;
		this.capital = capital;
	}



	@Override
	public String toString() {
		return "City [name=" + name + ", capital=" + capital + "]";
	}

}
