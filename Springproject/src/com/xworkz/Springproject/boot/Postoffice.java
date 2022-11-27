package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Postoffice {
@Autowired
private double officeOpenTime;
@Autowired
private double officeCloseTime;
@Autowired
private Postmaster postmaster;
public Postoffice() {
	System.out.println("postoffice");
}
public void detailsPostmaster() {
	System.out.println(postmaster.getPostmanName());
	System.out.println(postmaster.getSalary());
}
public double getOfficeCloseTime() {
	return officeCloseTime;
}
public double getOfficeOpenTime() {
	return officeOpenTime;
}

}
