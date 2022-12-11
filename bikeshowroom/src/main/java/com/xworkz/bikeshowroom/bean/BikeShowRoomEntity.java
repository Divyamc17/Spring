package com.xworkz.bikeshowroom.bean;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BikeShowRoomEntity {
  
	private String brand;
	private String ownerName;
	private String location;
	private String ambassador;
	private String description;
}
