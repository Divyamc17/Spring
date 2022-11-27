package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tv {
	@Autowired
	private String ownerName;
	@Autowired
	private String brandName;
	
	
	public Tv() {
		System.out.println(" tv default constructer");
	}

	public String getOwnerName() {
		return ownerName;
	}
	public String getBrandName() {
		return brandName;
	}
}
