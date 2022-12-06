package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.FlagEntity;

@Component
public interface FlagService {
	boolean validateAndSave(FlagEntity entity);

}
