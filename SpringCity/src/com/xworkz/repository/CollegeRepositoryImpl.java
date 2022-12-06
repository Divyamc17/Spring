package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.CollegeEntity;
@Component
public class CollegeRepositoryImpl implements CollegeRepository {

	@Override
	public boolean save(CollegeEntity entity) {
		System.out.println("college in repository");
		return false;
	}

}
