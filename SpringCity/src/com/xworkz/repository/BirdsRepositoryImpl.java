package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.BirdsEntity;
@Component
public class BirdsRepositoryImpl implements BirdsRepository {

	@Override
	public boolean save(BirdsEntity entity) {
		System.out.println("birds in repository");
		return false;
	}

}
