package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	
	@Autowired
	private String shopName;
	@Autowired
	private double shopRent;
	@Autowired
	private Tv tv;
	
	public Saloon() {
		System.out.println("default saloon");
	}
	
	
	public void displayDeatails() {
		System.out.println(tv.getBrandName());
		System.out.println(tv.getOwnerName());
	}
   
	public String getShopName() {
		return shopName;
	}
	public double getShopRent() {
		return shopRent;
	}
}
