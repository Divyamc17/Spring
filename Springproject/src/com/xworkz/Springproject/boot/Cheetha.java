package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cheetha {
@Autowired
private String cheethaColor;
@Autowired
private int cheethaLifeSpan;

public String getCheethaColor() {
	return cheethaColor;
}
public int getCheethaLifeSpan() {
	return cheethaLifeSpan;
}
}
