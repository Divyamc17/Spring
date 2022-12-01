package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

	@Component
	public class Ambulance {
		
		private String color;
		private String number;
		private int noOfBeds;
		@Value("true")
		private boolean oxygenCylinder;
		@Qualifier("ambuType")
		private String type;
		
		
		public Ambulance(String color, String number) {
			super();
			this.color = color;
			this.number = number;
		}
		
		public void setNoOfBeds(int noOfBeds) {
			this.noOfBeds = noOfBeds;
		}

		@Override
		public String toString() {
			return "Ambulance [color=" + color + ", number=" + number + ", noOfBeds=" + noOfBeds + ", oxygenCylinder="
					+ oxygenCylinder + ", type=" + type + "]";
		}
		

}
