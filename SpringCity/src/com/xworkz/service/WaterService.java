package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.WaterEntity;
@Component
public interface WaterService {
	
	boolean validateAndSave(WaterEntity entity);

}
