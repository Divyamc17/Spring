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
@Table(name="Customer_Feedback")
public class CustomerFeedbackEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Purpose")
	private String purpose;
	@Column(name="Ambience")
	private String ambience;
	@Column(name="VisitedFoodCourt")
	private String visitedFoodCourt;
	@Column(name="VisitedRestRoom")
	private String visitedRestRoom;
	@Column(name="ParkingExperience")
	private String parkingExperience;
	@Column(name="TotalExperience")
	private String totalExperience;
	@Column(name="FeedBack")
	private String feedBack;

	public CustomerFeedbackEntity(String purpose, String ambience, String visitedFoodCourt, String visitedRestRoom,
			String parkingExperience, String totalExperience, String feedBack) {
		super();
		this.purpose = purpose;
		this.ambience = ambience;
		this.visitedFoodCourt = visitedFoodCourt;
		this.visitedRestRoom = visitedRestRoom;
		this.parkingExperience = parkingExperience;
		this.totalExperience = totalExperience;
		this.feedBack = feedBack;
	}

}
