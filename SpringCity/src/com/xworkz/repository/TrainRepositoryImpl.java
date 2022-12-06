package com.xworkz.repository;

import com.xworkz.dto.TrainEntity;

public class TrainRepositoryImpl implements TrainRepository {

	@Override
	public boolean save(TrainEntity entity) {
		System.out.println("train in repository");
		return false;
	}

}
