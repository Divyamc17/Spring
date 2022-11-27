package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class King {
	@Autowired
	private String kingName;
	@Autowired
	private int kingAge;
	
	public int getKingAge() {
		return kingAge;
	}
	public String getKingName() {
		return kingName;
	}
	

}
