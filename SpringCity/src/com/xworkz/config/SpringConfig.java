package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.repository.BirdsRepository;
import com.xworkz.repository.BirdsRepositoryImpl;
import com.xworkz.repository.BuildingRepository;
import com.xworkz.repository.BuildingRepositoryImpl;
import com.xworkz.repository.CityRepository;
import com.xworkz.repository.CityRepositoryImpl;
import com.xworkz.repository.CollegeRepository;
import com.xworkz.repository.CollegeRepositoryImpl;
import com.xworkz.repository.FlagRepository;
import com.xworkz.repository.FlagRepositoryImpl;
import com.xworkz.repository.GoldRepository;
import com.xworkz.repository.GoldRepositoryImpl;
import com.xworkz.repository.OceanRepository;
import com.xworkz.repository.OceanRepositoryImpl;
import com.xworkz.repository.PlanetRepository;
import com.xworkz.repository.PlanetRepositoryImpl;
import com.xworkz.repository.TrainRepository;
import com.xworkz.repository.TrainRepositoryImpl;
import com.xworkz.repository.WaterRepository;
import com.xworkz.repository.WaterRepositoryImpl;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	
	@Bean
	public CityRepository cityRepository() {
		return new CityRepositoryImpl();
	}
  @Bean
  public PlanetRepository planetRepository() {
	  PlanetRepository planet=new PlanetRepositoryImpl();
	  return planet; 
  }
  @Bean 
  public OceanRepository oceanRepository() {
	  return new OceanRepositoryImpl();
  }
  @Bean
  public BirdsRepository birdsRepository() {
	  return new BirdsRepositoryImpl(); 
  }
  @Bean
  public WaterRepository waterRepository() {
	  return new WaterRepositoryImpl();
  }
  @Bean
  public BuildingRepository buildingRepository() {
	  return new BuildingRepositoryImpl();
  }
  @Bean
  public GoldRepository  goldRepository() {
	  return new GoldRepositoryImpl();
  }
  @Bean
  public TrainRepository trainRepository() {
	  return new TrainRepositoryImpl();
  }
  @Bean
  public FlagRepository flagRepository() {
	  return new FlagRepositoryImpl();
  }
  @Bean
  public CollegeRepository collegeRepository() {
	  CollegeRepository college=new  CollegeRepositoryImpl();
	  return college;
  }
}
