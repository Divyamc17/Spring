package com.xworkz.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Education {

	@Value("1")
	private String id;
	@Value("IIT")
	private String university;
	@Value("Metalergy")
	private String branch;
	@Value("1989")
	private int year;
	@Value("Karagpur")
	private String place;
	@Value("False")
	private boolean backlogs;
	@Value("70")
	private double percentage;
	@Value("True")
	private boolean passed;
	
	@Override
	public String toString() {
		return "Education [id=" + id + ", university=" + university + ", branch=" + branch + ", year=" + year
				+ ", place=" + place + ", backlogs=" + backlogs + ", percentage=" + percentage + ", passed=" + passed
				+ "]";
	}

	
	
}
	
	
	


