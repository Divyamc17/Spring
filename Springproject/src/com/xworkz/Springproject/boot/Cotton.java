package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cotton {
  @Autowired
  private String color;
  @Autowired
  private String season;
  
  public Cotton() {
	  System.out.println("cotton");
}
  public String getColor() {
	return color;
}
public String getSeason() {
	return season;
}
}
