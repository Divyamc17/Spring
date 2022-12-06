package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.PlanetEntity;
@Component
public interface PlanetRepository {
 
	boolean save(PlanetEntity entity);
}
