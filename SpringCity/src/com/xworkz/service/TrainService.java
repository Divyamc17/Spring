package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.TrainEntity;

@Component
public interface TrainService {
	boolean validateAndSave(TrainEntity entity);

}
