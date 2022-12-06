package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.PlanetEntity;

@Component
public interface PlanetService {
	boolean validateAndSave(PlanetEntity entity );

}
