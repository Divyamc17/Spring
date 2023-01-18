package com.xworkz.mall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer_Entity")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Mobile_No")
	private long mobileNo;
	@Column(name="Age")
	private int age;
	@Column(name="Country")
	private String country;
	@Column(name="State")
	private String state;
	@Column(name="City")
	private String city;
	@Column(name="Pincode")
	private long pincode;

	public CustomerEntity(String name, String email, long mobileNo, int age, String country, String state, String city,
			long pincode) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.age = age;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

}
