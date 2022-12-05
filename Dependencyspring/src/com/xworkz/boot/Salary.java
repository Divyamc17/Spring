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
@Value("true")
	private boolean ot;
@Value("true")
	private boolean variable;


/*public Salary(double grossSalary, double netSalary, double pf, double bonus, double hra, boolean ot, boolean variable) {
	super();
	this.grossSalary = grossSalary;
	this.netSalary = netSalary;
	this.pf = pf;
	this.bonus = bonus;
	this.hra = hra;
	this.ot = ot;
	this.variable = variable;
}*/
/*public Salary() {
	System.out.println("salary");
}*/

@Override
public String toString() {
	return "Salary [grossSalary=" + grossSalary + ", netSalary=" + netSalary + ", pf=" + pf + ", bonus=" + bonus
			+ ", hra=" + hra + ", ot=" + ot + ", variable=" + variable + "]";
}
	
	
}
