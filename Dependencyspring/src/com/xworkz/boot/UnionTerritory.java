package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class UnionTerritory {
	@Value("Delhi")
	private String name;
	@Value("154.23")
	private String area;
	@Value("Vinai kumar saxena")
	private String governorName;
	@Value("5000000")
	private double population;
	
	public UnionTerritory() {
		System.out.println("territory");
	}
	public UnionTerritory(String name, String area, String governorName, double population) {
		super();
		this.name = name;
		this.area = area;
		this.governorName = governorName;
		this.population = population;
	}


	@Override
	public String toString() {
		return "UnionTerritory [name=" + name + ", area=" + area + ", governorName=" + governorName + ", population="
				+ population + "]";
	}
	


}
