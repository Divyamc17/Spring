package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.TrainEntity;
import com.xworkz.repository.TrainRepository;

@Component
public class TrainServiceImpl implements TrainService {
@Autowired
@Qualifier("trainRepository")
private TrainRepository repo;
	@Override
	public boolean validateAndSave(TrainEntity entity) {
  System.out.println("train in service");
		return this.repo.save(entity);
	}

}
