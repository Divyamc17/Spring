package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.CollegeEntity;

@Component
public interface CollegeService {
	boolean validateAndSave(CollegeEntity entity);

}
