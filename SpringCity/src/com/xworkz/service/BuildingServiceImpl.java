package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.BuildingEntity;
import com.xworkz.repository.BuildingRepository;
@Component
public class BuildingServiceImpl implements BuildingService {
 @Autowired
 @Qualifier("buildingRepository")
 private BuildingRepository repo;
	@Override
	public boolean validateAndSave(BuildingEntity entity) {
		System.out.println("Building in service");
		return this.repo.save(entity);
	}

}
