package com.xworkz.Springqualifier.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Springqualifier.boot.Ambulance;
import com.xworkz.Springqualifier.boot.Borewell;
import com.xworkz.Springqualifier.boot.Judge;
import com.xworkz.Springqualifier.boot.Priest;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	
	@Bean
	public Ambulance ambulance() {
		Ambulance ambu=new Ambulance("White", "KA16");
		ambu.setNoOfBeds(2);
		return ambu;
		
	}
	
	@Bean
	public double closeTime() {
		System.out.println("register the close time");
		return 5.00;
	}

	@Bean
	public Judge judge() {
		Judge judge = new Judge("K C NarayanMurthy", 80);
		judge.setExperience(30);
		return judge;
	}
   @Bean
   public String type() {
	   System.out.println("register the type");
	   return "High Court";
   }
   @Bean
   public String education() {
	   return "LLB";
   }
  /* @Bean
   public boolean married() {
	   return false;
   }*/
   
   @Bean
  public Priest priest() {
	  Priest priest=new Priest("Acharya", 45, true);
	  priest.setWeight(70);
		  return priest;
	
  }
   
   @Bean
   public double salary() {
	   return 25000.00;
   }
 
   @Bean
   public String ambuType() {
	 return "Govt";
   }
   @Bean
   public Borewell borewell() {
	 Borewell well=new Borewell(600, 3) ;
	 well.setWaterTaste("Sweet");
	 return well;
   }
   @Bean
   public boolean waterPresent() {
	   return true;
   }
   @Bean
   public boolean working() {
	   return true;
   }
}
