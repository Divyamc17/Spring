package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Autowired
	private double zooOpenTime;
	@Autowired
	private double zooCloseTime;
	@Autowired
	private Tiger tiger;
	public Zoo() {
    System.out.println("zoo");
	} 
	public void displayTiger(){
		System.out.println(tiger.getTigerColor());
		System.out.println(tiger.getLifeSpan());
	}
	public double getZooOpenTime() {
		return zooOpenTime;
	}
	public double getZooCloseTime() {
		return zooCloseTime;
	}
}
