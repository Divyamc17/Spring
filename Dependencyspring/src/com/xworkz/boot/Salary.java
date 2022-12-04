package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
@Value("25000")
	private double grossSalary;
@Value("30000")
	private double netSalary;
@Value("5000")
	private double pf;
@Value("15000")
	private double bonus;
@Value("2500")
	private double hra;
@Value("2500")
	private boolean ot;
@Value("1000")
	private boolean variable;
@Override
public String toString() {
	return "Salary [grossSalary=" + grossSalary + ", netSalary=" + netSalary + ", pf=" + pf + ", bonus=" + bonus
			+ ", hra=" + hra + ", ot=" + ot + ", variable=" + variable + "]";
}
	
	
}
