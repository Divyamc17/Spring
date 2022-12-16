package com.xworkz.temple.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="temples_db")
@NamedQuery(name = "findByGod",query = "select temple from TempleEntity temple where temple.god=:gd")
public class TempleEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;
	private String location;
	private String god;
	private long pincode;
	private double fees;
	private double openTime;
	private double closeTime;
	
}
