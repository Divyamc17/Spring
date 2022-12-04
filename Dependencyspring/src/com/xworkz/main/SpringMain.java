package com.xworkz.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.boot.Country;
import com.xworkz.config.SpringConfig;

public class SpringMain {

	public static void main(String[] args) {

		ApplicationContext annotation=new AnnotationConfigApplicationContext(SpringConfig.class);
		Country coun=annotation.getBean(Country.class);
		System.out.println(coun);
	}

}
