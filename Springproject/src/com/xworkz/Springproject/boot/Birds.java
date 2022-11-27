package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Birds {
	@Autowired
	private String birdkingdom;
	@Autowired
	private String domain;
	@Autowired
	private Parrot parrot;
	@Autowired
	private Sparrow sparrow;
	@Autowired
	private Crow crow;
	
	public void displayAllBirds() {
	System.out.println(parrot.getParrotColor());
	System.out.println(parrot.getParrotlifeSpan());
	System.out.println(sparrow.getSparrowColor());
	System.out.println(sparrow.getSparrowLifeSpan());
	System.out.println(crow.getCrowColor());
	System.out.println(crow.getCrowSpan());
	}
public String getBirdkingdom() {
	return birdkingdom;
}
public String getDomain() {
	return domain;
}
}
