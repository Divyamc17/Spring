package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kanthara {
	@Autowired
	private String movieName;
	@Autowired
	private String heroName;
	
	public Kanthara() {
		System.out.println("kanthara");
	}
	public String getMovieName() {
		return movieName;
	}
	public String getHeroName() {
		return heroName;
	}
	

}
