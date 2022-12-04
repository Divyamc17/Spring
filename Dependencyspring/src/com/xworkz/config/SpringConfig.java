package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.boot.City;
import com.xworkz.boot.Name;
import com.xworkz.boot.President;
import com.xworkz.boot.PrimeMinister;
import com.xworkz.boot.State;
import com.xworkz.boot.UnionTerritory;
import com.xworkz.boot.VicePresident;

@Component
@ComponentScan("com.xworkz")
public class SpringConfig {

	@Bean
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
	public State state() {
		State state=new State();
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
	}
	
	
}
