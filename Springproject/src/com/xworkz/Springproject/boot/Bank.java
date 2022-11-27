package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Bank {
	@Autowired
	private String bankName;
	@Autowired
	private double shares;
	@Autowired
	private Customer customer;
	
	public Bank() {
		System.out.println("bank");
	}
	public void displayCustomer() {
		System.out.println(customer.getAccountNo());
		System.out.println(customer.getBalance());
	}
	public String getBankName() {
		return bankName;
	}
	public double getShares() {
		return shares;
	}
}
