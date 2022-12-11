package com.xworkz.temple.bean;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TempleEntity {
  
	private String location;
	private String god;
	private long pincode;
	private double fees;
	private double openTime;
	private double closeTime;
	
}
