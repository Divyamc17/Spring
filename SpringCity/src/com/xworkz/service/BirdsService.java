package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.BirdsEntity;

@Component
public interface BirdsService {

	boolean validateAndSave(BirdsEntity entity);
}
