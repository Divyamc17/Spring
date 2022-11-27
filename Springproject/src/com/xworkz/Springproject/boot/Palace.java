package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

@Component
public class Palace {
@Autowired
	private String palaceName;
@Autowired
	private String placeOfPlace;
@Autowired
private King king;
public  void displayKing() {
	System.out.println(king.getKingName());
	System.out.println(king.getKingAge());
}
public String getPalaceName() {
	return palaceName;
}
public String getPlaceOfPlace() {
	return placeOfPlace;
}
}
