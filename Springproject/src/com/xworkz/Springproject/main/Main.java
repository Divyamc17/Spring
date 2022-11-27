package com.xworkz.Springproject.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Springproject.boot.Animal;
import com.xworkz.Springproject.boot.Bank;
import com.xworkz.Springproject.boot.Birds;
import com.xworkz.Springproject.boot.Cloth;
import com.xworkz.Springproject.boot.Lenscart;
import com.xworkz.Springproject.boot.Movies;
import com.xworkz.Springproject.boot.Palace;
import com.xworkz.Springproject.boot.Pg;
import com.xworkz.Springproject.boot.Postoffice;
import com.xworkz.Springproject.boot.Saloon;
import com.xworkz.Springproject.boot.Saregamapa;
import com.xworkz.Springproject.boot.School;
import com.xworkz.Springproject.boot.Spect;
import com.xworkz.Springproject.boot.Temple;
import com.xworkz.Springproject.boot.Tv;
import com.xworkz.Springproject.boot.University;
import com.xworkz.Springproject.boot.Water;
import com.xworkz.Springproject.boot.Zoo;
import com.xworkz.Springproject.config.SpringConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext annotation=new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(annotation.getBeanDefinitionCount());
		String[] nam=annotation.getBeanDefinitionNames();
		for(String na:nam) {
			System.out.println(na);	
		}
		
	  
		Tv tv=annotation.getBean(Tv.class);
		System.out.println(tv.getBrandName());
		System.out.println(tv.getOwnerName());
		
		Saloon saloon=annotation.getBean(Saloon.class);
		System.out.println(saloon.getShopName());
		System.out.println(saloon.getShopRent());
		saloon.displayDeatails();
	 System.out.println("==============================");	
		
	 Spect spect=annotation.getBean(Spect.class);
	 System.out.println(spect.getType());
	 System.out.println(spect.getPrice());
	 
	 System.out.println("+++++++++++++++++++");
	 Lenscart cart=annotation.getBean(Lenscart.class);
	 System.out.println(cart.getShopNaam());
	 System.out.println(cart.getNoStaff());
	 cart.displaySpect();
	 System.out.println("=====================");
	 Saregamapa sare=annotation.getBean(Saregamapa.class);
	 System.out.println(sare.getAnchor());
	 System.out.println(sare.getNoJudges());
	 sare.displaySinger();
	 System.out.println("========================");
	 School school=annotation.getBean(School.class);
	 System.out.println(school.getSchoolName());
	 System.out.println(school.getFees());
	 school.displayStudent();
	 System.out.println("========================");
	 Movies movie=annotation.getBean(Movies.class);
	 System.out.println(movie.getLanguage());
	 System.out.println(movie.getProductionHouse());
	 movie.displayKanthara();
	 System.out.println("========================");
	 University uni=annotation.getBean(University.class);
	 System.out.println(uni.getUniversityName());
	 System.out.println(uni.getPlace());
	 uni.displayProfessor();
	 System.out.println("========================");
	 Pg pg=annotation.getBean(Pg.class);
	 System.out.println(pg.getPgOwner());
	 System.out.println(pg.getPricePg());
	 pg.displayMirror();
	 System.out.println("========================");
	 Cloth cloth=annotation.getBean(Cloth.class);
	 System.out.println(cloth.getClothPrice());
	 System.out.println(cloth.getClothType());
	 cloth.displayCotton();
	 System.out.println("========================");
	 Temple tem=annotation.getBean(Temple.class);
	 System.out.println(tem.getOpenTime());
	 System.out.println(tem.getCloseTime());
	 tem.displayGod();
	 System.out.println("========================");
	 Water water=annotation.getBean(Water.class);
	 System.out.println(water.getWaterColor());
	 System.out.println(water.getBoilingPoint());
	 water.displayOcean();
	 System.out.println("========================");
	 Zoo zoo=annotation.getBean(Zoo.class);
	 System.out.println(zoo.getZooOpenTime());
	 System.out.println(zoo.getZooCloseTime());
	 zoo.displayTiger();
	 System.out.println("========================");
	 Bank bank=annotation.getBean(Bank.class);
	 System.out.println(bank.getBankName());
	 System.out.println(bank.getShares());
	 bank.displayCustomer();
	 System.out.println("========================");
	 Postoffice post=annotation.getBean(Postoffice.class);
	 System.out.println(post.getOfficeOpenTime());
	 System.out.println(post.getOfficeCloseTime());
	 post.detailsPostmaster();
	 System.out.println("========================");
	 Palace palace=annotation.getBean(Palace.class);
	 System.out.println(palace.getPalaceName());
	 System.out.println(palace.getPlaceOfPlace());
	 palace.displayKing();
	 System.out.println("========================");
	 Animal animal=annotation.getBean(Animal.class);
	 System.out.println(animal.getKingdom());
	 System.out.println(animal.getDomain());
	 animal.displayAllAnimal();
	 System.out.println("========================");
	 Birds birds=annotation.getBean(Birds.class);
	 System.out.println(birds.getBirdkingdom());
	 System.out.println(birds.getDomain());
	 birds.displayAllBirds();
	
}
