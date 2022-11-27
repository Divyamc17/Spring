package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {
	@Autowired
	private String kingdom;
	@Autowired
	private String domain;
	@Autowired
	private Elephant elephant;
	@Autowired
	private Lion lion;
	@Autowired
	private Cheetha cheetha;
	@Autowired
	private Bear bear;
	@Autowired
	private Deer deer;
	
public Animal() {
System.out.println("animal");
}
public void displayAllAnimal() {
	System.out.println(elephant.getElephantColor());
	System.out.println(elephant.getElephantLifeSpan());
	System.out.println(lion.getLionColor());
	System.out.println(lion.getLionLifeSpan());
	System.out.println(cheetha.getCheethaColor());
	System.out.println(cheetha.getCheethaLifeSpan());
	System.out.println(bear.getBearColor());
	System.out.println(bear.getBearLifeSpan());
	System.out.println(deer.getDeerColor());
	System.out.println(deer.getDeerSpan());
}
public String getKingdom() {
	return kingdom;
}
public String getDomain() {
	return domain;
}
}
