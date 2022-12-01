package com.xworkz.Springqualifier.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.org.apache.bcel.internal.generic.LAND;
import com.xworkz.Springqualifier.boot.Ambulance;
import com.xworkz.Springqualifier.boot.Borewell;
import com.xworkz.Springqualifier.boot.Court;
import com.xworkz.Springqualifier.boot.Hospital;
import com.xworkz.Springqualifier.boot.Institute;
import com.xworkz.Springqualifier.boot.Judge;
import com.xworkz.Springqualifier.boot.Land;
import com.xworkz.Springqualifier.boot.Priest;
import com.xworkz.Springqualifier.boot.Temple;
import com.xworkz.Springqualifier.config.SpringConfig;

public class SpringMain {
	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		int beanDefinitionCount = spring.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);
		String[] names = spring.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		Court court = spring.getBean(Court.class);
		System.out.println(court);
		
		System.err.println("===========================================================");

		Judge bean = spring.getBean(Judge.class);
		System.out.println(bean);
		
		System.err.println("===========================================================");
		
		Temple temple=spring.getBean(Temple.class);
		System.out.println(temple);
		Priest priest=spring.getBean(Priest.class);
		System.out.println(priest);
		
		System.err.println("=========================================================");
		Hospital hospital=spring.getBean(Hospital.class);
		System.out.println(hospital);
		Ambulance ambu=spring.getBean(Ambulance.class);
		System.out.println(ambu);
		
		Land land=spring.getBean(Land.class);
		System.out.println(land);
		Borewell well=spring.getBean(Borewell.class);
		System.out.println(well);
		
		Institute ins=spring.getBean(Institute.class);
		System.out.println(ins);
		
		
	}

}
