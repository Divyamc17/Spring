package com.xworkz.chappals.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
 
	public SpringConfig() {
		System.out.println("SpringConfig in deft contr");
	}
}
