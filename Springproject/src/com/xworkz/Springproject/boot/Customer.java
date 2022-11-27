package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Autowired
	private double accountNo;
	@Autowired
	private double balance;

	public Customer() {
		System.out.println("customer");
	}
public double getAccountNo() {
	return accountNo;
}
public double getBalance() {
	return balance;
}
}
