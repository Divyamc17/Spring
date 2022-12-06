package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.OceanEntity;

@Component
public interface OceanService {
	boolean validateAndSave(OceanEntity entity);

}
