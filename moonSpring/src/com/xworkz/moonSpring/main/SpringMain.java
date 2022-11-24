package com.xworkz.moonSpring.main;

import javax.swing.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.moonSpring.bean.Cities;
import com.xworkz.moonSpring.bean.Mobile;
import com.xworkz.moonSpring.bean.Moon;
import com.xworkz.moonSpring.bean.Movie;
import com.xworkz.moonSpring.bean.NailPolish;
import com.xworkz.moonSpring.bean.Numbers;
import com.xworkz.moonSpring.config.SpringConfig;

public class SpringMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotation=new AnnotationConfigApplicationContext(SpringConfig.class);
		Moon moon=annotation.getBean(Moon.class);
		System.out.println(moon.hashCode());
		
		String string=annotation.getBean("color",String.class);
		System.out.println(string.hashCode());
		
		String shape=annotation.getBean("shape",String.class);
		System.out.println(shape.hashCode());
		
		Mobile mobile=annotation.getBean(Mobile.class);
		System.out.println(mobile.hashCode());
		
		Double double1=annotation.getBean("price",Double.class);
		System.out.println(double1.hashCode());
		
		Double double2=annotation.getBean("length",Double.class);
		System.out.println(double2.hashCode());
		
		Double double3=annotation.getBean("width",Double.class);
		System.out.println(double3.hashCode());
		
		Double double4=annotation.getBean("thickness",Double.class);
		System.out.println(double4.hashCode());
		
		NailPolish nailPolish=annotation.getBean(NailPolish.class);
		System.out.println(nailPolish.hashCode());
		
		String nailPolish1=annotation.getBean("nailPolishColor",String.class);
		System.out.println(nailPolish1.hashCode());
		
		String nailPolish2=annotation.getBean("nailPolishPrice",String.class);
		System.out.println(nailPolish2.hashCode());
		
		String nailPolish3=annotation.getBean("nailPolishBrand",String.class);
		System.out.println(nailPolish3.hashCode());
		
		Movie movie=annotation.getBean(Movie.class);
		System.out.println(movie.hashCode());
	
		String movie1=annotation.getBean("kanthara",String.class);
		System.out.println(movie1.hashCode());
		
		String movie2=annotation.getBean("kgf",String.class);
		System.out.println(movie2.hashCode());
	
		String movie3=annotation.getBean("mugulunage",String.class);
		System.out.println(movie3.hashCode());
	
		String movie4=annotation.getBean("bandana",String.class);
		System.out.println(movie4.hashCode());
		
		String movie5=annotation.getBean("gaalipata",String.class);
		System.out.println(movie5.hashCode());
		
		String movie6=annotation.getBean("ambari",String.class);
		System.out.println(movie6.hashCode());
		
		String movie7=annotation.getBean("gaalipata",String.class);
		System.out.println(movie7.hashCode());
		
		String movie8=annotation.getBean("sajini",String.class);
		System.out.println(movie8.hashCode());
		
		String movie9=annotation.getBean("ramachari",String.class);
		System.out.println(movie9.hashCode());
		
		String movie10=annotation.getBean("kashmireFiles",String.class);
		System.out.println(movie10.hashCode());
		
		String movie11=annotation.getBean("zoom",String.class);
		System.out.println(movie11.hashCode());
		
		String movie12=annotation.getBean("amar",String.class);
		System.out.println(movie12.hashCode());
		
		String movie13=annotation.getBean("gandadaGudi",String.class);
		System.out.println(movie13.hashCode());
		
		Cities city=annotation.getBean(Cities.class);
		System.out.println(city.hashCode());
		
		String city1=annotation.getBean("bangalore",String.class);
		System.out.println(city1.hashCode());
		
		String city2=annotation.getBean("Mysore",String.class);
		System.out.println(city2.hashCode());
		
		String city3=annotation.getBean("Tumkur",String.class);
		System.out.println(city3.hashCode());
		
		String city4=annotation.getBean("Gubbi",String.class);
		System.out.println(city4.hashCode());
		
		String city5=annotation.getBean("chikkamangalore",String.class);
		System.out.println(city5.hashCode());
		
		String city6=annotation.getBean("bidar",String.class);
		System.out.println(city6.hashCode());
		
		String city7=annotation.getBean("bagalokote",String.class);
		System.out.println(city7.hashCode());
		
		String city8=annotation.getBean("hubbli",String.class);
		System.out.println(city8.hashCode());
		
		String city9=annotation.getBean("mangalore",String.class);
		System.out.println(city9.hashCode());
		
		String city10=annotation.getBean("kodagu",String.class);
		System.out.println(city10.hashCode());
		
		String city11=annotation.getBean("belghavi",String.class);
		System.out.println(city11.hashCode());
		
		String city12=annotation.getBean("koppala",String.class);
		System.out.println(city12.hashCode());
		
		String city13=annotation.getBean("bijapura",String.class);
		System.out.println(city13.hashCode());
		
		Numbers num=annotation.getBean(Numbers.class);
		System.out.println(num.hashCode());

		String num1=annotation.getBean("one",String.class);
		System.out.println(num1.hashCode());
		
		String num2=annotation.getBean("two",String.class);
		System.out.println(num2.hashCode());
		
		String num3=annotation.getBean("three",String.class);
		System.out.println(num3.hashCode());
		
		String num4=annotation.getBean("four",String.class);
		System.out.println(num4.hashCode());
		
		String num5=annotation.getBean("five",String.class);
		System.out.println(num5.hashCode());
		
		String num6=annotation.getBean("six",String.class);
		System.out.println(num6.hashCode());
		
		String num7=annotation.getBean("seven",String.class);
		System.out.println(num7.hashCode());
		
		String num8=annotation.getBean("eight",String.class);
		System.out.println(num8.hashCode());
		
		String num9=annotation.getBean("nine",String.class);
		System.out.println(num9.hashCode());
		
		String num10=annotation.getBean("ten",String.class);
		System.out.println(num10.hashCode());
		
		//String num11=annotation.getBean("eleven",String.class);
		System.out.println(annotation.getBean("eleven",String.class).hashCode());
		System.out.println(annotation.getBean("twelve",Integer.class).hashCode());
		System.out.println(annotation.getBean("thirteen",Integer.class).hashCode());
		System.out.println(annotation.getBean("fourteen",Integer.class).hashCode());
		System.out.println(annotation.getBean("fifteen",Integer.class).hashCode());
		System.out.println(annotation.getBean("sixteen",Integer.class).hashCode());
		System.out.println(annotation.getBean("seventeen",Integer.class).hashCode());
		System.out.println(annotation.getBean("eighteen",Integer.class).hashCode());
		System.out.println(annotation.getBean("ninghteen",Integer.class).hashCode());
		System.out.println(annotation.getBean("twenty",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentyOne",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentytwo",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentyThree",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentyFour",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentyFive",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentySix",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentySeven",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentyeight",Integer.class).hashCode());
		System.out.println(annotation.getBean("twentynine",Integer.class).hashCode());
		System.out.println(annotation.getBean("thirty",Integer.class).hashCode());
		
		
	}

}
