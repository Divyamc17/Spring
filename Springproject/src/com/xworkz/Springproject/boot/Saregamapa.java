package com.xworkz.Springproject.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saregamapa {
	
	@Autowired
	private String anchor;
	@Autowired
	private int noJudges;
	@Autowired
	private Singer singer;
	
	public Saregamapa() {
		System.out.println("default saregamapa");
	}	
	public void displaySinger() {
		System.out.println(singer.getName());
		System.out.println(singer.getAge());
	}
	
	public String getAnchor() {
		return anchor;
	}
 public int getNoJudges() {
	return noJudges;
}
}
