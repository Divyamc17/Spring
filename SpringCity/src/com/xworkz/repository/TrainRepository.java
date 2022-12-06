package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.TrainEntity;
@Component
public interface TrainRepository {
	
	boolean save(TrainEntity entity);

}
