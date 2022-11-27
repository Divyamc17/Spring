package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Temple {
@Autowired	
private double openTime;
@Autowired
private double closeTime;
@Autowired
private God god;

public Temple() {
	System.out.println("temple");
}
public void displayGod() {
System.out.println(god.getGodName());
System.out.println(god.getHeight());
	
}
public double getOpenTime() {
	return openTime;
}
public double getCloseTime() {
	return closeTime;
}
}
