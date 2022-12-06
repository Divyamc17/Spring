package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.CityEntity;

@Component
public interface CityService {
	boolean validateAndSave(CityEntity entity);

}
