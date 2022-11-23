package com.xworkz.moonSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.moonSpring.bean.Cities;
import com.xworkz.moonSpring.bean.Mobile;
import com.xworkz.moonSpring.bean.Moon;
import com.xworkz.moonSpring.bean.Movie;
import com.xworkz.moonSpring.bean.NailPolish;
import com.xworkz.moonSpring.bean.Numbers;

@Configuration
public class SpringConfig {

	@Bean
	public Moon moon() {
		System.out.println("moon is created");
		Moon moon=new Moon();
		return moon;			
	}
	@Bean
	public String color()
	{
		System.out.println("color is white");
		return "white";
	}
	@Bean
	public String shape() {
		System.out.println("shape is round"); 
		return "Round";
	}
	
	@Bean
	public Mobile mobile() {
		System.out.println("mobile is created");
		Mobile mobile=new Mobile();
		return mobile;
	}
	@Bean 
	public double price() {
		System.out.println("mobile price");
		return 10000.0;
	}
	@Bean
	public double length() {
		System.out.println("mobile length");
		return 12.30;
	}
	@Bean
	public double width() {
		System.out.println("mobile width");
		return  5.30;
	}
	@Bean
	public double thickness() {
		System.out.println("mobile thickness");
		return 2.35;
	}
	@Bean
	public NailPolish nailpolish() {
		System.out.println("nailpolish is good");
		NailPolish nailPolish=new NailPolish();
		return nailPolish;
	}
	@Bean
	public String nailPolishColor() {
		System.out.println("red color");
		return "red";
	}
	@Bean
	public String nailPolishPrice() {
		System.out.println("price is 75");
		return "75";
}
	@Bean
	public String nailPolishBrand() {
		System.out.println("brand"); 
		return "nailTrend";
	}
	
	@Bean
	public Movie movie() {
		System.out.println("movie");
		Movie movie=new Movie();
		return movie;
	}
	@Bean
	public String kanthara() {
		System.out.println("kanthara movie");
		return "kanthara";
	}
	@Bean
	public String kgf() {
		System.out.println("kgf movie");
		return "kgf";
	}
	@Bean
	public String mugulunage() {
		System.out.println("mugulunage movie");
		return "mugulunage";
    }
	@Bean
	public String bandana() {
		System.out.println("bandana movie");
		return "bandana";
    }
	@Bean
	public String gaalipata() {
		System.out.println("gaalipata movie");
		return "gaalipata";
    }
	@Bean
	public String ambari() {
		System.out.println("ambari movie");
		return "ambari";
    }
	@Bean
	public String sajini() {
		System.out.println("sajini movie");
		return "sajini";
    }
	@Bean
	public String ramachari() {
		System.out.println("ramachari movie");
		return "ramachari";
    }
	@Bean
	public String kashmireFiles() {
		System.out.println("kashmireFiles movie");
		return "kashmireFiles";
    }
	@Bean
	public String zoom() {
		System.out.println("zoom movie");
		return "zoom";
    }
	@Bean
	public String amar() {
		System.out.println("amar movie");
		return "amar";
    }
	@Bean
	public String gandadaGudi() {
		System.out.println("gandadaGudi movie");
		return "gandadaGudi";
    }
	@Bean
	public Cities cities() {
		System.out.println("City");
		Cities city=new Cities();
		return city;
	}
	@Bean
	public String bangalore() {
		System.out.println("bengaluru");
		return "bengaluru";
	}
	@Bean
	public String Mysore() {
		System.out.println("Mysore");
		return "Mysore";
	}
	@Bean
	public String Tumkur() {
		System.out.println("Tumkur");
		return "Tumkur";
	}
	@Bean
	public String Gubbi() {
		System.out.println("Gubbi");
		return "Gubbi";
	}
	@Bean
	public String chikkamangalore() {
		System.out.println("chikkamangalore");
		return "chikkamangalore";
	}
	@Bean
	public String bidar() {
		System.out.println("bidar");
		return "bidar";
	}
	
	@Bean
	public String bagalokote() {
		System.out.println("bagalokote");
		return "bagalokote";
	}
	
	@Bean
	public String hubbli() {
		System.out.println("hubbli");
		return "hubbli";
	}
	@Bean
	public String mangalore() {
		System.out.println("mangalore");
		return "mangalore";
	}
	@Bean
	public String kodagu() {
		System.out.println("kodagu");
		return "kodagu";
	}
	@Bean
	public String belghavi() {
		System.out.println("belghavi");
		return "belghavi";
	}
	@Bean
	public String koppala() {
		System.out.println("koppala");
		return "koppala";
	}
	@Bean
	public String bijapura() {
		System.out.println("bijapura");
		return "bijapura";
	}
	@Bean
	public Numbers numbers() {
		System.out.println("numbers");
		Numbers num=new Numbers();
		return num;
	}
	@Bean
	public String one() {
		System.out.println("one");
		return "1";
	
	}
	@Bean
	public String two() {
		System.out.println("two");
		return "2";
	
	}
	@Bean
	public String three() {
		System.out.println("three");
		return "3";
	
	}
	@Bean
	public String four() {
		System.out.println("four");
		return "4";
	
	}
	@Bean
	public String five() {
		System.out.println("five");
		return "5";
	
	}
	@Bean
	public String six() {
		System.out.println("six");
		return "6";
	
	}
	@Bean
	public String seven() {
		System.out.println("seven");
		return "7";
	
	}
	@Bean
	public String eight() {
		System.out.println("eight");
		return "8";
	
	}
	@Bean
	public String nine() {
		System.out.println("nine");
		return "9";
	
	}
	@Bean
	public String ten() {
		System.out.println("ten");
		return "10";
	
	}
	@Bean
	public String eleven() {
		System.out.println("eleven");
		return "11";
	
	}
}
