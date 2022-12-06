package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.CityEntity;
@Component
public class CityRepositoryImpl implements CityRepository {

	@Override
	public boolean save(CityEntity entity) {
		System.out.println("city in repository");
		return false; 
	}

	
	

	
}
