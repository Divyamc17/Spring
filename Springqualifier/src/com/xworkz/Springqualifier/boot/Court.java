package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Court {

@Value("High Court")	
private String type;
private double openTime;
@Autowired
//@Qualifier("closeTime")
private double closeTime;

public Court(@Value("9.00") double openTime) {
	super();
	this.openTime = openTime;
}
public void setColseTime(double closeTime) {
	this.closeTime = closeTime;
}
@Override
public String toString() {
	return "Court [type=" + type + ", openTime=" + openTime + ", closeTime=" + closeTime + "]";
}

	
}
