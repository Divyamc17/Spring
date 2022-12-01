package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Temple {
	 private String name;
	 private String godName;
	 @Value("Murudeshwara")
	 private String place;
	 
	 
	public Temple(@Value("Shiva temple") String name) {
		super();
		this.name = name;
	}
	@Value("Mahadeva")
	public void setGodName(String godName) {
		this.godName = godName;
	}
	@Override
	public String toString() {
		return "Temple [name=" + name + ", godName=" + godName + ", place=" + place + "]";
	}
	 
	 

}
