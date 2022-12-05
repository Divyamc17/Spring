package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.boot.City;
import com.xworkz.boot.Country;
import com.xworkz.boot.Credential;
import com.xworkz.boot.Name;
import com.xworkz.boot.President;
import com.xworkz.boot.PrimeMinister;
import com.xworkz.boot.States;
import com.xworkz.boot.UnionTerritory;
import com.xworkz.boot.VicePresident;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {

	@Bean
	public Country country() {
		System.out.println("Registering the country");
		Country country=new Country();
		return country;
	}
	
	@Bean
	public Credential type() {
		System.out.println("Registering the type");
		return Credential.PERSON;
	}
	
	
	
/*	@Bean
	public Name name() {
		Name name=new Name();
		return name;			
	}
	
	
	
	@Bean
	public President president() {
		President president=new President();
		return president;			
	}
	@Bean
	public VicePresident vicePresident() {
		VicePresident vicePresident=new VicePresident();
		return vicePresident;			
	}
	@Bean
	public PrimeMinister primeMinister() {
		PrimeMinister primeMinister=new PrimeMinister();
		return primeMinister;			
	}
	@Bean
	public States states() {
		States state=new States();
		return state;			
	}
	@Bean
	public UnionTerritory unionTerritory() {
		UnionTerritory union=new UnionTerritory();
		return union;			
	}
	@Bean
	public City capitalCity() {
		City city=new City();
		return city;			
	}*/
	
	
}
