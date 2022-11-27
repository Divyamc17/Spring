package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
@Autowired
public String parrotColor;
@Autowired
public int parrotlifeSpan;

public String getParrotColor() {
	return parrotColor;
}
public int getParrotlifeSpan() {
	return parrotlifeSpan;
}
}


