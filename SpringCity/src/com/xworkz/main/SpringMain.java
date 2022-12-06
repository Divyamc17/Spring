package com.xworkz.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.SpringConfig;
import com.xworkz.service.BirdsService;
import com.xworkz.service.BuildingService;
import com.xworkz.service.CityService;
import com.xworkz.service.CollegeService;
import com.xworkz.service.FlagService;
import com.xworkz.service.GoldService;
import com.xworkz.service.OceanService;
import com.xworkz.service.PlanetService;
import com.xworkz.service.TrainService;
import com.xworkz.service.WaterService;

public class SpringMain {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		CityService service=context.getBean(CityService.class);
		System.out.println(service.validateAndSave(null));
		PlanetService service1=context.getBean(PlanetService.class);
		System.out.println(service1.validateAndSave(null));
		OceanService service2=context.getBean(OceanService.class);
		System.out.println(service2.validateAndSave(null));
		BirdsService service3=context.getBean(BirdsService.class);
		System.out.println(service3.validateAndSave(null));
		WaterService service4=context.getBean(WaterService.class);
		System.out.println(service4.validateAndSave(null));
		BuildingService service5=context.getBean(BuildingService.class);
		System.out.println(service5.validateAndSave(null));
		GoldService service6=context.getBean(GoldService.class);
		System.out.println(service6.valiadateAndSave(null));
		TrainService service7=context.getBean(TrainService.class);
		System.out.println(service7.validateAndSave(null));
		FlagService service8=context.getBean(FlagService.class);
		System.out.println(service8.validateAndSave(null));
		CollegeService service9=context.getBean(CollegeService.class);
		System.out.println(service9.validateAndSave(null));
		
		
	}

}
