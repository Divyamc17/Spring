package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.BuildingEntity;
@Component
public class BuildingRepositoryImpl implements BuildingRepository {

	@Override
	public boolean save(BuildingEntity entity) {
		System.out.println("Bulding in repository");
		return false;
	}

}
