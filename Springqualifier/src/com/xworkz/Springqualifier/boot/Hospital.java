package com.xworkz.Springqualifier.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
    @Value("St.Jhons")
	private String name;
	private int noBeds;
	private int noStaffs;
	private boolean ot;
	private double fees;
	
	public Hospital(@Value("500")int noBeds, @Value("400") int noStaffs, @Value("true")boolean ot) {
		super();
		this.noBeds = noBeds;
		this.noStaffs = noStaffs;
		this.ot = ot;
	}
	@Value("15000")
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", noBeds=" + noBeds + ", noStaffs=" + noStaffs + ", ot=" + ot + ", fees="
				+ fees + "]";
	}
	
	
}
