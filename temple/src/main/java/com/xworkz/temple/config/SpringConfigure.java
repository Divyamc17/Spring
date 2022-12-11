package com.xworkz.temple.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfigure {
	public SpringConfigure() {
		System.out.println("SpringConfigure in default constr");
	}

}
