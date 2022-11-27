package com.xworkz.Springproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	
	@Bean
	public String ownerName() {
		System.out.println("register ownername");
		return "Mandal";
	}
     @Bean
	public String brandName() {
		System.out.println("register ownername");
		return "mi";
	}
   
     @Bean
     public String shopName() {
    	 System.out.println("register shopname");
    	 return "lakhme";
     }
     @Bean
     public double shopRent() {
    	 System.out.println("register shopname");
    	 return 20000.00;
     }
     @Bean
     public String type() {
    	 System.out.println("register spect");
    	 return "glass";
     }
     @Bean
     public double price() {
    	 System.out.println("register price");
    	 return 3000.00;
     }
     @Bean
     public String shopNaam() {
    	 System.out.println("register shopname");
    	 return "Lenscart";
     }
     @Bean
     public int noStaff() {
    	 System.out.println("register noofstaff");
    	 return 7;
     }
     @Bean
     public String anchor() {
    	 System.out.println("register anchor");
    	 return "Anushree";
     }
     @Bean
     public int noJudges() {
    	 System.out.println("register noJudges");
    	 return 8;
     }
     @Bean 
     public String name() {
     System.out.println("register name");
     return "Harsha";
     }
     @Bean
     public int age() {
    	 System.out.println("register age");
    	 return 35;
     }
     @Bean
     public String schoolName() {
    	 System.out.println("register schoolname");
    	 return "jns";
     }
     @Bean
     public double fees() {
    	 System.out.println("register fees");
    	 return 25000.00;
     }
     @Bean
     public String hesaru() {
    	 System.out.println("register hesaru");
    	 return "druthi";
     }
     @Bean
     public int standard() {
    	 System.out.println("register standard");
    	 return  5;
     }
     @Bean
     public String movieName() {
    	 System.out.println("register moviename");
    	 return "kanthara";
     }
     @Bean
     public String heroName() {
    	 System.out.println("register heroname");
    		 return "RishabShetty";
    	 }
    @Bean
    public String language() {
    	System.out.println("register language");
    	return "Kannada";
    }
    @Bean
    public String productionHouse() {
    	System.out.println("register productionHouse");
    	return "prph";
    }
    @Bean
    public String nameProfessor() {
    	System.out.println("register name");
    	return "ramesh";
    }
    @Bean
    public String spealization() {
    	System.out.println("register spealization");
    	return "science";
    }
    @Bean
    public String universityName() {
    	System.out.println("register universityName");
    	return "kuvempu";
    }
    @Bean
    public String place() {
    	System.out.println("register place");
    	return "mysore";
    }
    @Bean
    public String pgOwner() {
    	System.out.println("register pg owner");
    	return "venkatesh";
    }
    @Bean
    public double pricePg() {
    System.out.println("register price");
    return 6000.00;
    }
    @Bean
    public double length() {
    	System.out.println("register length");
    	return 15.00;
    }
    @Bean
    public double width() {
    	System.out.println("register length");
    	return 7.00;
    }
    @Bean
    public String color() {
    	System.out.println("register color");
    	return "white";
    }
    @Bean
    public String season() {
    	System.out.println("register season");
    	return "summer";
    }
    @Bean
    public String clothType() {
    	System.out.println("register clothtype");
    	return "cotton";
    }
    @Bean
    public double clothPrice() {
    	System.out.println("register cothprice");
    	return 2000.00;
    }
    @Bean
    public double openTime() {
    	System.out.println("register opentime");
    	return 6.00;
    }
    @Bean 
    public double closeTime() {
    	System.out.println("register closetime");
    	return 8.00;
    }
    @Bean 
    public String godName() {
    	System.out.println("register name");
    	return "Mallikarjuna";
    }
    @Bean
    public double height() {
    	System.out.println("register height");
    	return 3.00;
    }
    @Bean
    public String oceanName() {
    	System.out.println("register oceanname");
    	return "Specific Ocean";
    }
    @Bean
    public double area() {
    	System.out.println("register area");
    	return 156.23;
    }
    @Bean 
    public String waterColor() {
    	System.out.println("register color");
    	return "colorsless";
    }
    @Bean
    public double boilingPoint() {
    	System.out.println("regidter bolingPoint");
    	return 100.00;
    }
    @Bean
    public double zooOpenTime() {
    	System.out.println("register opentime");
    	
    	return 7.00;
    }
    @Bean
    public double zooCloseTime() {
    	System.out.println("register close time");
    	return 8.00;
    }
    @Bean
    public String tigerColor() {
    	System.out.println("register tiger");
    	return "gold with black strips";
    }
    @Bean
    public int lifeSpan() {
    	System.out.println("register span");
    	return 70;
    }
    @Bean
    public String bankName() {
    	System.out.println("register bankname");
    	return "canara";
    	
    }
    @Bean
    public double shares() {
    	System.out.println("register shares");
    	return 100000.00;
    }
    @Bean
    public double accountNo() {
    	System.out.println("register accountno");
    	return 1289.00;
    }
    @Bean
    public double balance() {
    	System.out.println("register balance");
    	return 1.00;
    }
    @Bean
    public String postmanName() {
    	System.out.println("register name");
    	return "sundar";
    }
    @Bean
    public double salary() {
    	System.out.println("register salary");
    	return 15000.00;
    }
    @Bean 
    public double officeOpenTime() {
    	System.out.println("register open");
    	return 9.00;
    }
    @Bean
    public double officeCloseTime() {
    	System.out.println("register close");
    	return 5.00;
    }
    @Bean
    public String kingName() {
    	System.out.println("register name");
    	return "wodeyar";
    }
    @Bean
    public int kingAge() {
    	System.out.println("register age");
    	return 35;
    }
    @Bean
    public String palaceName() {
    	System.out.println("register name");
    	return "AMVP";
    }
    @Bean
    public String placeOfPlace() {
    	System.out.println("register mysore");
    	return "mysore";
    }
    @Bean
    public String elephantColor() {
    	System.out.println("register color");
    	return "black";
    }
    @Bean
    public int elephantLifeSpan() {
    	System.out.println("register elephant");
    	return 150;
    }
    @Bean
    public String kingdom() {
    	System.out.println("register kingdom");
    	return "Annimalia";
    	
    }
    @Bean
    public String domain() {
    	System.out.println("register domain");
    	return "Eukaryota";
    }
    @Bean 
    public String lionColor() {
    	System.out.println("register color");
    	return "gold";
    }
    @Bean
    public int lionLifeSpan() {
    System.out.println("register span");
    return 200;
    }
    @Bean
    public String cheethaColor() {
    	System.out.println("register cheethaclor");
    	return "darkgold";
    }
    @Bean
    public int cheethaLifeSpan() {
    	System.out.println("register cheethaspan");
    	return 140;
    }
    @Bean
    public String deerColor() {
    	System.out.println("register color");
    	return "brown";
    }
    @Bean
    public int deerSpan() {
    	System.out.println("register life span");
    	return 80;
    }
    @Bean
    public String bearColor() {
    	System.out.println("register bear life span");
    	return "black";
    }
    @Bean
    public int bearLifeSpan() {
    	System.out.println("register span");
    	return 90;
    }
    @Bean
    public String  birdkingdom() {
    	System.out.println("register kingdom");
    	return "Animalla";
    }
    @Bean
    public String birdDomain() {
    	System.out.println("register domain");
    	return "Aves";
    }
    @Bean
    public String parrotColor() {
    	System.out.println("register color");
    	return "green";
    }
    @Bean
    public int parrotlifeSpan() {
    	System.out.println("regisster lifesspan");
    	return 50;
    }
    @Bean
    public String sparrowColor() {
    	System.out.println("register color");
    	return "lightbrown";
    }
    @Bean
    public int sparrowLifeSpan() {
    	System.out.println("register span");
    	return 45;
    }
    @Bean
    public String crowColor() {
    	System.out.println("register color");
    	return "black";
    }
    @Bean
    public int crowSpan() {
    	System.out.println("register span");
    	return 70;
    }
    
     }

