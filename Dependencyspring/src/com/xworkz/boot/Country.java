package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {
	@Value("India")
	private String name;
	@Autowired
	private President president;
	@Autowired
	private VicePresident vicePresident;
	@Autowired
	private PrimeMinister primeMinister;
	@Value("1451223")
	private double armySize;
	@Value("Democratic")
	private String type;
	@Autowired
	// @Qualifier("state")
	private States states;
	@Autowired
	private UnionTerritory unionTerritory;
	@Autowired
	private City capitalCity;

	

	@Override
	public String toString() {
		return "Country [name=" + name + ", president=" + president + ", vicePresident=" + vicePresident
				+ ", primeMinister=" + primeMinister + ", armySize=" + armySize + ", type=" + type + ", states="
				+ states + ", unionTerritory=" + unionTerritory + ", capitalCity=" + capitalCity + "]";
	}

	

	
}
