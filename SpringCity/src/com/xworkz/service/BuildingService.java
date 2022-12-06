package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.BuildingEntity;

@Component
public interface BuildingService {
	boolean validateAndSave(BuildingEntity entity);

}
