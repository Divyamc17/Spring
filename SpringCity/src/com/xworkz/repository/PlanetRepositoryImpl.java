package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.PlanetEntity;
@Component
public class PlanetRepositoryImpl implements PlanetRepository {

	@Override
	public boolean save(PlanetEntity entity) {
     System.out.println("planet in repository");
		return false;
	}

}
