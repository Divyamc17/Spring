package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Name {
    @Value("Sundar")
	private String firstName;
    @Value("S")
	private String middleName;
    @Value("Pichai")
	private String lastName;
	//private Credential type;
    
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
    
   
	
}
	
	
		
	

