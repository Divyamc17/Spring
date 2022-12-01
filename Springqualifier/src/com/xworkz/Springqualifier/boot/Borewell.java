package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Borewell {
	
	private int depth;
	private int width;
	private String waterTaste;
	@Autowired
	private boolean waterPresent;
	@Autowired
	private boolean working;
	
	
	public Borewell(int depth, int width) {
		super();
		this.depth = depth;
		this.width = width;
	}
	
	public void setWaterTaste(String waterTaste) {
		this.waterTaste = waterTaste;
	}

	@Override
	public String toString() {
		return "Borewell [depth=" + depth + ", width=" + width + ", waterTaste=" + waterTaste + ", waterPresent="
				+ waterPresent + ", working=" + working + "]";
	}


}
