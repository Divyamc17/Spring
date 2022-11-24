package com.xworkz.moonSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.moonSpring.bean.Alphabet;
import com.xworkz.moonSpring.bean.Cities;
import com.xworkz.moonSpring.bean.Mobile;
import com.xworkz.moonSpring.bean.Moon;
import com.xworkz.moonSpring.bean.Movie;
import com.xworkz.moonSpring.bean.NailPolish;
import com.xworkz.moonSpring.bean.Numbers;

@Configuration
@ComponentScan("com.xworkz")
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
	@Bean
	public Integer twelve() {
		System.out.println("twelve");
		return 12;
	
	}
	@Bean
	public Integer thirteen () {
		System.out.println("thirteen");
		return 13;
	
	}
@Bean
public Integer fourteen() {
	System.out.println("fourteen");
	return 14;

}
 @Bean
public Integer fifteen() {
	System.out.println("fifteen");
	return 15;

}
  @Bean
public Integer sixteen() {
	System.out.println("sixteen");
	return 16;

}
 @Bean
public Integer seventeen() {
	System.out.println("seventeen");
	return 17;

}
@Bean
public Integer eighteen() {
	System.out.println("eighteen");
	return 18;

}
@Bean
public Integer ninghteen() {
	System.out.println("ninghteen");
	return 19;

}
@Bean
public Integer twenty() {
	System.out.println("twenty");
	return 20;

}
@Bean
public Integer twentyOne() {
	System.out.println("twentyOne");
	return 21;

}
@Bean
public Integer twentytwo() {
	System.out.println("twentytwo");
	return 22;

}
@Bean
public Integer twentyThree() {
	System.out.println("twentytThree");
	return 23;

}
@Bean
public Integer twentyFour() {
	System.out.println("twentyFour");
	return 24;

}
@Bean
public Integer twentyFive() {
	System.out.println("twentyFive");
	return 25;

}
@Bean
public Integer twentySix() {
	System.out.println("twentySix");
	return 26;

}
@Bean
public Integer twentySeven () {
	System.out.println("twentySeven");
	return 27;

}
@Bean
public Integer twentyeight() {
	System.out.println("twentyeight");
	return 28;

}
@Bean
public Integer twentynine() {
	System.out.println("twentynine");
	return 29;

}
@Bean
public Integer thirty() {
	System.out.println("thirty");
	return 30;

}
@Bean
public Integer thirtyOne() {
	System.out.println("thirtyOne");
	return 31;

}
@Bean
public Integer thirtyTwo() {
	System.out.println("thirtyTwo");
	return 32;

}

@Bean
public Integer thirtyThree() {
	System.out.println("thirtyThree");
	return 33;

}
@Bean
public Integer thirtyFour() {
	System.out.println("thirtyFour");
	return 34;

}
@Bean
public Integer thirtyFive() {
	System.out.println("thirtyFive");
	return 35;

}
@Bean
public Integer thirtySix() {
	System.out.println("thirtySix");
	return 36;

}
@Bean
public Integer thirtySeven() {
	System.out.println("thirtySeven");
	return 37;

}
@Bean
public Integer thirtyEight() {
	System.out.println("thirtyEight");
	return 38;

}
@Bean
public Integer thirtyNine() {
	System.out.println("thirtyNine");
	return 39;

}
@Bean
public Integer fourty() {
	System.out.println("Fourty");
	return 40;

}
@Bean
public Integer fourtyOne() {
	System.out.println("FourtyOne");
	return 41;

}
@Bean
public Integer fourtyTwo() {
	System.out.println("FourtyTwo");
	return 42;

}
@Bean
public Integer fourtyThree() {
	System.out.println("FourtyThree");
	return 43;

}

@Bean
public Integer fourtyFour() {
	System.out.println("FourtyFour");
	return 44;

}
@Bean
public Integer fourtyFive() {
	System.out.println("FourtyFive");
	return 45;

}
@Bean
public Integer fourtySix() {
	System.out.println("FourtySix");
	return 46;

}
@Bean
public Integer fourtySeven() {
	System.out.println("FourtySeven");
	return 47;

}
@Bean
public Integer fourtyEight() {
	System.out.println("FourtyEight");
	return 48;

}
@Bean
public Integer fourtyNine() {
	System.out.println("FourtyNine");
	return 49;

}

@Bean
public Integer fifty() {
	System.out.println("Fifty");
	return 50;

}
@Bean
public Integer fiftyOne() {
	System.out.println("FiftyOne");
	return 51;

}
@Bean
public Integer fiftyTwo() {
	System.out.println("FiftyTwo");
	return 52;

}
@Bean
public Integer fiftyThree() {
	System.out.println("FiftyThree");
	return 53;

}
@Bean
public Integer fiftyFour() {
	System.out.println("FiftyFour");
	return 54;

}
@Bean
public Integer fiftyFive() {
	System.out.println("FiftyFive");
	return 55;

}
@Bean
public Integer fiftySix() {
	System.out.println("FiftySix");
	return 56;

}
@Bean
public Integer fiftySeven() {
	System.out.println("FiftySeven");
	return 57;

}
@Bean
public Integer fiftyEight() {
	System.out.println("FiftyEight");
	return 58;

}
@Bean
public Integer fiftyNine() {
	System.out.println("FiftyNine");
	return 59;

}
@Bean
public Integer sixtey() {
	System.out.println("Sixtey");
	return 60;

}
@Bean
public Integer sixteyOne() {
	System.out.println("SixteyOne");
	return 61;

}
@Bean
public Integer sixtyTwo() {
	System.out.println("SixtyTwo");
	return 62;

}
@Bean
public Integer sixtyThree() {
	System.out.println("SixtyThree");
	return 63;

}
@Bean
public Integer sixtyFour() {
	System.out.println("SixtyFour");
	return 64;

}
@Bean
public Integer sixtyFive() {
	System.out.println("SixtyFive");
	return 65;

}
@Bean
public Integer sixtySix() {
	System.out.println("SixtySix");
	return 66;

}
@Bean
public Integer sixtySeven() {
	System.out.println("SixtySeven");
	return 67;

}
@Bean
public Integer sixtyEight() {
	System.out.println("SixtyEight");
	return 68;

}
@Bean
public Integer sixtyNine() {
	System.out.println("SixtyNine");
	return 69;

}
@Bean
public Integer seventy() {
	System.out.println("Seventy");
	return 70;

}
@Bean
public Integer seventyOne() {
	System.out.println("SeventyOne");
	return 71;

}
@Bean
public Integer seventyTwo() {
	System.out.println("SeventyTwo");
	return 72;

}
@Bean
public Integer seventyThree() {
	System.out.println("SeventyThree");
	return 73;

}
@Bean
public Integer seventyFour() {
	System.out.println("SeventyFour");
	return 74;

}
@Bean
public Integer seventyFive() {
	System.out.println("SeventyFive");
	return 75;

}
@Bean
public Integer seventySix() {
	System.out.println("SeventySix");
	return 76;

}
@Bean
public Integer seventySeven() {
	System.out.println("SeventySeven");
	return 77;

}
@Bean
public Integer seventyEight() {
System.out.println("seventyEight");
	return 78;

}
 @Bean
public Integer seventyNine() {
	System.out.println("seventyNine");
	return 78;

}
@Bean
public Integer eighty() {
	System.out.println("eighty");
	return 80;

}
@Bean
public Integer eightyOne() {
	System.out.println("eightyOne");
	return 81;

}
 @Bean
public Integer eightyTwo() {
	System.out.println("eightyTwo");
	return 82;

}
@Bean
public Integer eightyThree() {
	System.out.println("eightyThree");
	return 83;

}
@Bean
public Integer eightyFour() {
	System.out.println("eightyFour");
	return 84;

}
@Bean
public Integer eightyFive() {
	System.out.println("eightyFive");
	return 85;

}
@Bean
public Integer eightySix() {
	System.out.println("eightySix");
	return 86;

}
@Bean
public Integer eightySeven() {
	System.out.println("eightySeven");
	return 87;

}
@Bean
public Integer eightyEight() {
	System.out.println("eightyEight");
	return 88;

}
@Bean
public Integer eightyNine() {
	System.out.println("eightyNine");
	return 89;

}

@Bean
public Integer ninty() {
	System.out.println("ninty");
	return 90;

}
@Bean
public Integer nintyOne() {
	System.out.println("nintyOne");
	return 91;

}
@Bean
public Integer nintyTwo() {
	System.out.println("NintyTwo");
	return 92;

}
@Bean
public Integer nintyThree() {
	System.out.println("nintyThree");
	return 93;

} 
@Bean
public Integer nintyFour() {
	System.out.println("nintyFour");
	return 94;

}
@Bean
public Integer nintyFive() {
	System.out.println("nintyFive");
	return 95;

}
@Bean
public Integer nintySix() {
	System.out.println("nintySix");
	return 96;

}
@Bean
public Integer nintySeven() {
	System.out.println("nintySeven");
	return 97;

}
@Bean
public Integer nintyEight() {
	System.out.println("nintyEight");
	return 98;

}
@Bean
public Integer nintyNine() {
	System.out.println("nintyNine");
	return 99;

}
@Bean
public Integer hundred() {
	System.out.println("hundred");
	return 100;

}
		
@Bean
public Integer hundredOne() {
	System.out.println("Register the hundredOne");
	return 101;		
}
@Bean
public Integer hundredTwo() {
	System.out.println("Register the hundredTwo");
	return 102;		
}
@Bean
public Integer hundredThree() {
	System.out.println("Register the hundredThree");
	return 103;		
}
@Bean
public Integer hundredFour() {
	System.out.println("Register the hundredFour");
	return 104;		
}
@Bean
public Integer hundredFive() {
	System.out.println("Register the hundredFive");
	return 105;		
}
@Bean
public Integer hundredSix() {
	System.out.println("Register the hundredSix");
	return 106;		
}
@Bean
public Integer hundredSeven() {
	System.out.println("Register the hundredSeven");
	return 107;		
}
@Bean
public Integer hundredEight() {
	System.out.println("Register the hundredEight");
	return 108;		
}
@Bean
public Integer hundredNine() {
	System.out.println("Register the hundredNine");
	return 109;		
}
@Bean
public Integer hundredTen() {
	System.out.println("Register the hundredTen");
	return 110;		
}
@Bean
public Integer hundredEleven() {
	System.out.println("Register the hundredEleven");
	return 111;		
}
@Bean
public Integer hundredTwelve() {
	System.out.println("Register the hundredTwelve");
	return 112;		
}
@Bean
public Integer hundredThirteen() {
	System.out.println("Register the hundredThirteen");
	return 113;		
}
@Bean
public Integer hundredFourteen() {
	System.out.println("Register the hundredFourteen");
	return 114;		
}
@Bean
public Integer hundredFifteen() {
	System.out.println("Register the hundredFifteen");
	return 115;		
}
@Bean
public Integer hundredSixteen() {
	System.out.println("Register the hundredSixteen");
	return 116;		
}
@Bean
public Integer hundredSeventeen() {
	System.out.println("Register the hundredSeventeen");
	return 117;		
}
@Bean
public Integer hundredEighteen() {
	System.out.println("Register the hundredEighteen");
	return 118;		
}
@Bean
public Integer hundredNinteen() {
	System.out.println("Register the hundredNinteen");
	return 119;		
}
@Bean
public Integer hundredTwenty() {
	System.out.println("Register the hundredTwenty");
	return 120;		
}
@Bean
public Integer hundredTwentyOne() {
	System.out.println("Register the hundredTwentyone");
	return 121;		
}
@Bean
public Integer hundredTwentyTwo() {
	System.out.println("Register the hundredTwentyTwo");
	return 122;		
}
@Bean
public Integer hundredTwentyThree() {
	System.out.println("Register the hundredTwentyThree");
	return 123;		
}
@Bean
public Integer hundredTwentyFour() {
	System.out.println("Register the hundredTwentyFour");
	return 124;		
}
@Bean
public Integer hundredTwentyFive() {
	System.out.println("Register the hundredTwentyFive");
	return 125;		
}
@Bean
public Integer hundredTwentysix() {
	System.out.println("Register the hundredTwentysix");
	return 126;		
}
@Bean
public Integer hundredTwentySeven() {
	System.out.println("Register the hundredTwentySeven");
	return 127;		
}
@Bean
public Integer hundredTwentyEight() {
	System.out.println("Register the hundredTwentyEight");
	return 128;		
}
@Bean
public Integer hundredTwentyNine() {
	System.out.println("Register the hundredTwentyNine");
	return 129;		
}
@Bean
public Integer hundredThirty() {
	System.out.println("Register the hundredThirty");
	return 130;		
}
@Bean
public Integer hundredThirtyOne() {
	System.out.println("Register the hundredThirtyOne");
	return 131;		
}
@Bean
public Integer hundredThirtyTwo() {
	System.out.println("Register the hundredThirtyTwo");
	return 132;		
}
@Bean
public Integer hundredThirtyThree() {
	System.out.println("Register the hundredThirtyThree");
	return 133;		
}
@Bean
public Integer hundredThirtyFour() {
	System.out.println("Register the hundredThirtyFour");
	return 134;		
}
@Bean
public Integer hundredThirtyFive() {
	System.out.println("Register the hundredThirtyFive");
	return 135;		
}
@Bean
public Integer hundredThirtySix() {
	System.out.println("Register the hundredThirtySix");
	return 136;		
}
@Bean
public Integer hundredThirtySeven() {
	System.out.println("Register the hundredThirtySeven");
	return 137;		
}
@Bean
public Integer hundredThirtyEight() {
	System.out.println("Register the hundredThirtyEight");
	return 138;		
}
@Bean
public Integer hundredFourty() {
	System.out.println("Register the hundredFourty");
	return 140;		
}
@Bean
public Integer hundredFourtyOne() {
	System.out.println("Register the hundredFourtyOne");
	return 141;		
}
@Bean
public Integer hundredFourtyTwo() {
	System.out.println("Register the hundredFourtyTwo");
	return 142;		
}
@Bean
public Integer hundredFourtyThree() {
	System.out.println("Register the hundredFourtyThree");
	return 143;		
}
@Bean
public Integer hundredFourtyFour() {
	System.out.println("Register the hundredFourtyFour");
	return 144;		
}
@Bean
public Integer hundredFourtyFive() {
	System.out.println("Register the hundredFourtyFive");
	return 145;		
}
@Bean
public Integer hundredFourtySix() {
	System.out.println("Register the hundredFourtySix");
	return 146;		
}
@Bean
public Integer hundredFourtySeven() {
	System.out.println("Register the hundredFourtySeven");
	return 147;		
}
@Bean
public Integer hundredFourtyEight() {
	System.out.println("Register the hundredFourtyEight");
	return 148;		
}
@Bean
public Integer hundredFourtyNine() {
	System.out.println("Register the hundredFourtyNine");
	return 149;		
}
@Bean
public Integer hundredFifty() {
	System.out.println("Register the hundredFifty");
	return 150;		
}
@Bean
public Integer hundredFiftyOne() {
	System.out.println("Register the hundredFiftyOne");
	return 151;		
}
@Bean
public Integer hundredFiftyTwo() {
	System.out.println("Register the hundredFiftyTwo");
	return 152;		
}
@Bean
public Integer hundredFiftyThree() {
	System.out.println("Register the hundredFiftyThree");
	return 153;		
}
@Bean
public Integer hundredFiftyFour() {
	System.out.println("Register the hundredFiftyFour");
	return 154;		
}
@Bean
public Integer hundredFiftyFive() {
	System.out.println("Register the hundredFiftyFive");
	return 155;		
}
@Bean
public Integer hundredFiftySix() {
	System.out.println("Register the hundredFiftySix");
	return 156;		
}
@Bean
public Integer hundredFiftySeven() {
	System.out.println("Register the hundredFiftySeven");
	return 157;		
}
@Bean
public Integer hundredFiftyEight() {
	System.out.println("Register the hundredFiftyEight");
	return 158;		
}
@Bean
public Integer hundredFiftyNine() {
	System.out.println("Register the hundredFiftyNine");
	return 159;		
}
@Bean
public Integer hundredSixty() {
	System.out.println("Register the hundredSixty");
	return 160;		
}
@Bean
public Integer hundredSixtyOne() {
	System.out.println("Register the hundredSixtyOne");
	return 161;		
}
@Bean
public Integer hundredSixtyTwo() {
	System.out.println("Register the hundredSixtyTwo");
	return 162;		
}
@Bean
public Integer hundredSixtyThree() {
	System.out.println("Register the hundredSixtyThree");
	return 163;		
}
@Bean
public Integer hundredSixtyFour() {
	System.out.println("Register the hundredSixtyFour");
	return 164;		
}
@Bean
public Integer hundredSixtyFive() {
	System.out.println("Register the hundredSixtyFive");
	return 165;		
}
@Bean
public Integer hundredSixtySix() {
	System.out.println("Register the hundredSixtySix");
	return 166;		
}
@Bean
public Integer hundredSixtySeven() {
	System.out.println("Register the hundredSixtySeven");
	return 167;		
}
@Bean
public Integer hundredSixtyEight() {
	System.out.println("Register the hundredSixtyEight");
	return 168;		
}
@Bean
public Integer hundredSixtyNine() {
	System.out.println("Register the hundredSixtyNine");
	return 169;		
}
@Bean
public Integer hundredSeventy() {
	System.out.println("Register the hundredSeventy");
	return 170;		
}
@Bean
public Integer hundredSeventyOne() {
	System.out.println("Register the hundredSeventyOne");
	return 171;		
}
@Bean
public Integer hundredSeventyTwo() {
	System.out.println("Register the hundredSeventyTwo");
	return 172;		
}
@Bean
public Integer hundredSeventyThree() {
	System.out.println("Register the hundredSeventyThree");
	return 173;		
}
@Bean
public Integer hundredSeventyFour() {
	System.out.println("Register the hundredSeventyFour");
	return 174;		
}
@Bean
public Integer hundredSeventyFive() {
	System.out.println("Register the hundredSeventyFive");
	return 175;		
}
@Bean
public Integer hundredSeventySix() {
	System.out.println("Register the hundredSeventySix");
	return 176;		
}
@Bean
public Integer hundredSeventySeven() {
	System.out.println("Register the hundredSeventySeven");
	return 177;		
}
@Bean
public Integer hundredSeventyEight() {
	System.out.println("Register the hundredSeventyEight");
	return 178;		
}
@Bean
public Integer hundredSeventyNine() {
	System.out.println("Register the hundredSeventyNine");
	return 179;		
}
@Bean
public Integer hundredEighty() {
	System.out.println("Register the hundredEighty");
	return 180;		
}
@Bean
public Integer hundredEightyOne() {
	System.out.println("Register the hundredEightyOne");
	return 181;		
}
@Bean
public Integer hundredEightyTwo() {
	System.out.println("Register the hundredEightyTwo");
	return 182;		
}
@Bean
public Integer hundredEightyThree() {
	System.out.println("Register the hundredEightyThree");
	return 183;		
}
@Bean
public Integer hundredEightyFour() {
	System.out.println("Register the hundredEightyFour");
	return 184;		
}
@Bean
public Integer hundredEightyFive() {
	System.out.println("Register the hundredEightyFive");
	return 185;		
}
@Bean
public Integer hundredEightySix() {
	System.out.println("Register the hundredEightySix");
	return 186;		
}
@Bean
public Integer hundredEightySeven() {
	System.out.println("Register the hundredEightySeven");
	return 187;		
}
@Bean
public Integer hundredEightyEight() {
	System.out.println("Register the hundredEightyEight");
	return 188;		
}
@Bean
public Integer hundredEightyNine() {
	System.out.println("Register the hundredEightyNine");
	return 189;		
}
@Bean
public Integer hundredNinty() {
	System.out.println("Register the hundredNinty");
	return 190;		
}
@Bean
public Integer hundredNintyOne() {
	System.out.println("Register the hundredNintyOne");
	return 191;		
}
@Bean
public Integer hundredNintyTwo() {
	System.out.println("Register the hundredNintyTwo");
	return 192;		
}
@Bean
public Integer hundredNintyThree() {
	System.out.println("Register the hundredNintyThree");
	return 193;		
}
@Bean
public Integer hundredNintyFour() {
	System.out.println("Register the hundredNintyFour");
	return 194;		
}
@Bean
public Integer hundredNintyFive() {
	System.out.println("Register the hundredNintyFive");
	return 195;		
}
@Bean
public Integer hundredNintySix() {
	System.out.println("Register the hundredNintySix");
	return 196;		
}
@Bean
public Integer hundredNintySeven() {
	System.out.println("Register the hundredNintySeven");
	return 197;		
}
@Bean
public Integer hundredNintyEight() {
	System.out.println("Register the hundredNintyEight");
	return 198;		
}
@Bean
public Integer hundredNintyNine() {
	System.out.println("Register the hundredNintyNine");
	return 199;		
}
@Bean
public Integer twoHundred() {
	System.out.println("Register the twoHundred");
	return 200;		
}
@Bean
public Integer twoHundredOne() {
	System.out.println("Register the twoHundredOne");
	return 201;		
}
@Bean
public Integer twoHundredTwo() {
	System.out.println("Register the twoHundredTwo");
	return 202;		
}
@Bean
public Integer twoHundredThree() {
	System.out.println("Register the twoHundredThree");
	return 203;		
}
@Bean
public Integer twoHundredFour() {
	System.out.println("Register the twoHundredFour");
	return 204;		
}
@Bean
public Integer twoHundredFive() {
	System.out.println("Register the twoHundredFive");
	return 205;		
}
@Bean
public Integer twoHundredSix() {
	System.out.println("Register the twoHundredSix");
	return 206;		
}
@Bean
public Integer twoHundredSeven() {
	System.out.println("Register the twoHundredSeven");
	return 207;		
}
@Bean
public Integer twoHundredEight() {
	System.out.println("Register the twoHundredEight");
	return 208;		
}
@Bean
public Integer twoHundredNine() {
	System.out.println("Register the twoHundredNine");
	return 209;		
}
@Bean
public Integer twoHundredTen() {
	System.out.println("Register the twoHundredTen");
	return 210;		
}
@Bean
public Integer twoHundredEleven() {
	System.out.println("Register the twoHundredEleven");
	return 211;		
}
@Bean
public Integer twoHundredTwelve() {
	System.out.println("Register the twoHundredTwelve");
	return 212;		
}
@Bean
public Integer twoHundredThirteen() {
	System.out.println("Register the twoHundredThirteen");
	return 213;		
}
@Bean
public Integer twoHundredFourteen() {
	System.out.println("Register the twoHundredFourteen");
	return 214;		
}
@Bean
public Integer twoHundredFifteen() {
	System.out.println("Register the twoHundredFifteen");
	return 215;		
}
@Bean
public Integer twoHundredSixteen() {
	System.out.println("Register the twoHundredSixteen");
	return 216;		
}
@Bean
public Integer twoHundredSeventeen() {
	System.out.println("Register the twoHundredSeventeen");
	return 217;		
}
@Bean
public Integer twoHundredEighteen() {
	System.out.println("Register the twoHundredEighteen");
	return 218;		
}
@Bean
public Integer twoHundredNinteen() {
	System.out.println("Register the twoHundredNinteen");
	return 219;		
}
@Bean
public Integer twoHundredTwenty() {
	System.out.println("Register the twoHundredTwenty");
	return 220;		
}
@Bean
public Integer twoHundredTwentyOne() {
	System.out.println("Register the twoHundredTwentyOne");
	return 221;		
}
@Bean
public Integer twoHundredTwentyTwo() {
	System.out.println("Register the twoHundredTwentyTwo");
	return 222;		
}
@Bean
public Integer twoHundredTwentyThree() {
	System.out.println("Register the twoHundredTwentyThree");
	return 223;		
}
@Bean
public Integer twoHundredTwentyFour() {
	System.out.println("Register the twoHundredTwentyFour");
	return 224;		
}
@Bean
public Integer twoHundredTwentyFive() {
	System.out.println("Register the twoHundredTwentyFive");
	return 225;		
}
@Bean
public Integer twoHundredTwentySix() {
	System.out.println("Register the twoHundredTwentySix");
	return 226;		
}
@Bean
public Integer twoHundredTwentySeven() {
	System.out.println("Register the twoHundredTwentySeven");
	return 227;		
}
@Bean
public Integer twoHundredTwentyEight() {
	System.out.println("Register the twoHundredTwentyEight");
	return 228;		
}
@Bean
public Integer twoHundredTwentyNine() {
	System.out.println("Register the twoHundredTwentyNine");
	return 229;		
}
@Bean
public Integer twoHundredThirty() {
	System.out.println("Register the twoHundredThirty");
	return 230;		
}
@Bean
public Integer twoHundredThirtyOne() {
	System.out.println("Register the twoHundredThirtyOne");
	return 231;		
}
@Bean
public Integer twoHundredThirtyTwo() {
	System.out.println("Register the twoHundredThirtyTwo");
	return 232;		
}
@Bean
public Integer twoHundredThirtyThirteen() {
	System.out.println("Register the twoHundredThirtyThirteen");
	return 233;		
}
@Bean
public Integer twoHundredThirtyFour() {
	System.out.println("Register the twoHundredThirtyFour");
	return 234;		
}
@Bean
public Integer twoHundredThirtyFive() {
	System.out.println("Register the twoHundredThirtyFive");
	return 235;		
}
@Bean
public Integer twoHundredThirtySix() {
	System.out.println("Register the twoHundredThirtySix");
	return 236;		
}
@Bean
public Integer twoHundredThirtySeven() {
	System.out.println("Register the twoHundredThirtySeven");
	return 237;		
}
@Bean
public Integer twoHundredThirtyEight() {
	System.out.println("Register the twoHundredThirtyEight");
	return 238;		
}
@Bean
public Integer twoHundredThirtyNine() {
	System.out.println("Register the twoHundredThirtyNine");
	return 239;		
}
@Bean
public Integer twoHundredFourty() {
	System.out.println("Register the one");
	return 240;		
}
@Bean
public Integer twoHundredFourtyOne() {
	System.out.println("Register the twoHundredFourtyOne");
	return 241;		
}
@Bean
public Integer twoHundredFourtyTwo() {
	System.out.println("Register the twoHundredFourtyTwo");
	return 242;		
}
@Bean
public Integer twoHundredFourtyThree() {
	System.out.println("Register the twoHundredFourtyThree");
	return 243;		
}
@Bean
public Integer twoHundredFourtyFour() {
	System.out.println("Register the twoHundredFourtyFour");
	return 244;		
}
@Bean
public Integer twoHundredFourtyFive() {
	System.out.println("Register the twoHundredFourtyFive");
	return 245;		
}
@Bean
public Integer twoHundredFourtySix() {
	System.out.println("Register the twoHundredFourtySix");
	return 246;		
}
@Bean
public Integer twoHundredFourtySeven() {
	System.out.println("Register the twoHundredFourtySeven");
	return 247;		
}
@Bean
public Integer twoHundredFourtyEight() {
	System.out.println("Register the twoHundredFourtyEight");
	return 248;		
}
@Bean
public Integer twoHundredFourtyNine() {
	System.out.println("Register the twoHundredFourtyNine");
	return 249;		
}
@Bean
public Integer twoHundredFifty() {
	System.out.println("Register the twoHundredFifty");
	return 250;		
}
@Bean
public Integer twoHundredFiftyOne() {
	System.out.println("Register the twoHundredFiftyOne");
	return 251;		
}
@Bean
public Integer twoHundredFiftyTwo() {
	System.out.println("Register the twoHundredFiftyTwo");
	return 252;		
}
@Bean
public Integer twoHundredFiftyThree() {
	System.out.println("Register the twoHundredFiftyThree");
	return 253;		
}
@Bean
public Integer twoHundredFiftyFour() {
	System.out.println("Register the twoHundredFiftyFour");
	return 254;		
}
@Bean
public Integer twoHundredFiftyFive() {
	System.out.println("Register the twoHundredFiftyFive");
	return 255;		
}
@Bean
public Integer twoHundredFiftySix() {
	System.out.println("Register the twoHundredFiftySix");
	return 256;		
}
@Bean
public Integer twoHundredFiftySeven() {
	System.out.println("Register the twoHundredFiftySeven");
	return 257;		
}
@Bean
public Integer twoHundredFiftyEight() {
	System.out.println("Register the twoHundredFiftyEight");
	return 258;		
}
@Bean
public Integer twoHundredFiftyNine() {
	System.out.println("Register the twoHundredFiftyNine");
	return 259;		
}
@Bean
public Integer twoHundredSixty() {
	System.out.println("Register the twoHundredSixty");
	return 260;		
}
@Bean
public Integer twoHundredSixtyOne() {
	System.out.println("Register the twoHundredSixtyOne");
	return 261;		
}
@Bean
public Integer twoHundredSixtyTwo() {
	System.out.println("Register the twoHundredSixtyTwo");
	return 262;		
}
@Bean
public Integer twoHundredSixtyThree() {
	System.out.println("Register the twoHundredSixtyThree");
	return 263;		
}
@Bean
public Integer twoHundredSixtyFour() {
	System.out.println("Register the twoHundredSixtyFour");
	return 264;		
}
@Bean
public Integer twoHundredSixtyFive() {
	System.out.println("Register the twoHundredSixtyFive");
	return 265;		
}
@Bean
public Integer twoHundredSixtySix() {
	System.out.println("Register the twoHundredSixtySix");
	return 266;		
}
@Bean
public Integer twoHundredSixtySeven() {
	System.out.println("Register the twoHundredSixtySeven");
	return 267;		
}
@Bean
public Integer twoHundredSixtyEight() {
	System.out.println("Register the twoHundredSixtyEight");
	return 268;		
}
@Bean
public Integer twoHundredSixtyNine() {
	System.out.println("Register the twoHundredSixtyNine");
	return 269;		
}
@Bean
public Integer twoHundredSeventy() {
	System.out.println("Register the twoHundredSeventy");
	return 270;		
}
@Bean
public Integer twoHundredSeventyOne() {
	System.out.println("Register the twoHundredSeventyOne");
	return 271;		
}
@Bean
public Integer twoHundredSeventyTwo() {
	System.out.println("Register the twoHundredSeventyTwo");
	return 272;		
}
@Bean
public Integer twoHundredSeventyThree() {
	System.out.println("Register the twoHundredSeventyThree");
	return 273;		
}
@Bean
public Integer twoHundredSeventyFour() {
	System.out.println("Register the twoHundredSeventyFour");
	return 274;		
}
@Bean
public Integer twoHundredSeventyFive() {
	System.out.println("Register the twoHundredSeventyFive");
	return 275;		
}
@Bean
public Integer twoHundredSeventySix() {
	System.out.println("Register the twoHundredSeventySix");
	return 276;		
}
@Bean
public Integer twoHundredSeventySeven() {
	System.out.println("Register the twoHundredSeventySeven");
	return 277;		
}
@Bean
public Integer twoHundredSeventyEight() {
	System.out.println("Register the twoHundredSeventyEight");
	return 278;		
}
@Bean
public Integer twoHundredSeventyNine() {
	System.out.println("Register the twoHundredSeventyNine");
	return 279;		
}
@Bean
public Integer twoHundredEighty() {
	System.out.println("Register the twoHundredEighty");
	return 280;		
}
@Bean
public Integer twoHundredEightyOne() {
	System.out.println("Register the twoHundredEightyOne");
	return 281;		
}
@Bean
public Integer twoHundredEightyTwo() {
	System.out.println("Register the twoHundredEightyTwo");
	return 282;		
}
@Bean
public Integer twoHundredEightyThree() {
	System.out.println("Register the twoHundredEightyThree");
	return 283;		
}
@Bean
public Integer twoHundredEightyFour() {
	System.out.println("Register the twoHundredEightyFour");
	return 284;		
}
@Bean
public Integer twoHundredEightyFive() {
	System.out.println("Register the twoHundredEightyFive");
	return 285;		
}
@Bean
public Integer twoHundredEightySix() {
	System.out.println("Register the twoHundredEightySix");
	return 286;		
}
@Bean
public Integer twoHundredEightySeven() {
	System.out.println("Register the twoHundredEightySeven");
	return 287;		
}
@Bean
public Integer twoHundredEightyEight() {
	System.out.println("Register the twoHundredEightyEight");
	return 288;		
}
@Bean
public Integer twoHundredEightyNine() {
	System.out.println("Register the twoHundredEightyNine");
	return 289;		
}
@Bean
public Integer twoHundredNinty() {
	System.out.println("Register the twoHundredNinty");
	return 290;		
}
@Bean
public Integer twoHundredNintyOne() {
	System.out.println("Register the twoHundredNintyOne");
	return 291;		
}
@Bean
public Integer twoHundredNintyTwo() {
	System.out.println("Register the twoHundredNintyTwo");
	return 292;		
}
@Bean
public Integer twoHundredNintyThree() {
	System.out.println("Register the twoHundredNintyThree");
	return 293;		
}
@Bean
public Integer twoHundredNintyFour() {
	System.out.println("Register the twoHundredNintyFour");
	return 294;		
}
@Bean
public Integer twoHundredNintyFive() {
	System.out.println("Register the twoHundredNintyFive");
	return 295;		
}
@Bean
public Integer twoHundredNintySix() {
	System.out.println("Register the twoHundredNintySix");
	return 296;		
}
@Bean
public Integer twoHundredNintySeven() {
	System.out.println("Register the twoHundredNintySeven");
	return 297;		
}
@Bean
public Integer twoHundredNintyEight() {
	System.out.println("Register the twoHundredNintyEight");
	return 298;		
}
@Bean
public Integer twoHundredNintyNine() {
	System.out.println("Register the twoHundredNintyNine");
	return 299;		
}
@Bean
public Integer threeHundred() {
	System.out.println("Register the threeHundred");
	return 300;		
}
@Bean
public Alphabet alphabet() {
	System.out.println("Alphabet");
	Alphabet alpha=new Alphabet();
	return alpha;
}
 @Bean 
 public String apple() {
	 System.out.println("apple");
	 return "apple";
 }

 @Bean 
 public String ball() {
	 System.out.println("ball");
	 return "ball";
 }
 @Bean 
 public String cat() {
	 System.out.println("cat");
	 return "cat";
 }
 @Bean 
 public String dog() {
	 System.out.println("dog");
	 return "dog";
 }
 @Bean 
 public String elephant() {
	 System.out.println("elephant");
	 return "elephant";
 }
 @Bean 
 public String fan() {
	 System.out.println("fan");
	 return "fan";
 }
 @Bean 
 public String gun() {
	 System.out.println("gun");
	 return "gun";
 }
 @Bean 
 public String ink() {
	 System.out.println("ink");
	 return "ink";
 }
 @Bean 
 public String hat() {
	 System.out.println("hat");
	 return "hat";
 }
 @Bean 
 public String jug() {
	 System.out.println("jug");
	 return "jug";
 }
 @Bean 
 public String kite() {
	 System.out.println("kite");
	 return "kite";
 }
 @Bean 
 public String lion() {
	 System.out.println("lion");
	 return "lion";
 }
 @Bean 
 public String mango() {
	 System.out.println("mango");
	 return "mango";
 }
 @Bean 
 public String nest() {
	 System.out.println("nest");
	 return "nest";
 }
 @Bean 
 public String owl() {
	 System.out.println("owl");
	 return "owl";
 }
 @Bean 
 public String pen() {
	 System.out.println("pen");
	 return "pen";
 }
 @Bean 
 public String queen() {
	 System.out.println("queen");
	 return "queen";
 }
 @Bean 
 public String rose() {
	 System.out.println("rose");
	 return "rose";
 }
 @Bean 
 public String tab() {
	 System.out.println("tab");
	 return "tab";
 }
 @Bean 
 public String sun() {
	 System.out.println("sun");
	 return "sun";
 }
 @Bean 
 public String umbrella() {
	 System.out.println("umbrella");
	 return "umbrella";
 }
 @Bean 
 public String van() {
	 System.out.println("van");
	 return "van";
 }
 @Bean 
 public String watch() {
	 System.out.println("watch");
	 return "watch";
 }
 @Bean 
 public String xRay() {
	 System.out.println("xRay");
	 return "xRay";
 }
 @Bean 
 public String yatch() {
	 System.out.println("yatch");
	 return "yatch";
 }
 @Bean 
 public String zeebra() {
	 System.out.println("zeebra");
	 return "zeebra";
 }

}
