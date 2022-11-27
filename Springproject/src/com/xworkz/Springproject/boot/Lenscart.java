package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lenscart {
	
	@Autowired
	private String shopNaam;
	@Autowired
	private int noStaff;
	@Autowired
	private Spect spect;
	
	public Lenscart() {
    System.out.println("default lenscart");
	}
	
	public void displaySpect() {
	System.out.println(spect.getType());
	System.out.println(spect.getPrice());
	}
	public String getShopNaam() {
		return shopNaam;
	}
	public int getNoStaff() {
		return noStaff;
	}
}
