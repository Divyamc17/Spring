package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movies {
 @Autowired
 private String language;
 @Autowired
 private String productionHouse;
 @Autowired
 private Kanthara kanthara;
 
 public Movies() {
	 System.out.println("kanthara");
}
 public void displayKanthara() {
	 System.out.println(kanthara.getHeroName());
	 System.out.println(kanthara.getMovieName());
 }
 public String getLanguage() {
	return language;
}
 public String getProductionHouse() {
	return productionHouse;
}
 public Kanthara getKanthara() {
	return kanthara;
}
}
