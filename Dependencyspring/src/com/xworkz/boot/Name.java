package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Name {
	@Value("Smt")
	private String firstName;
	@Value("Droupadi")
	private String middleName;
	@Value("Murmu")
	private String lastName;
	@Autowired
	@Qualifier("type")
	private Credential type;
	/*public Name() {
		System.out.println("name");
	}

	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}*/
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", type="
				+ type + "]";
	}

	

}
