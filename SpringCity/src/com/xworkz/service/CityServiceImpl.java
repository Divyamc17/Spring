package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.CityEntity;
import com.xworkz.repository.CityRepository;
@Component
public class CityServiceImpl implements CityService {

	@Autowired
	@Qualifier("cityRepository")
	private CityRepository repo;
	@Override
	public boolean validateAndSave(CityEntity entity) {
		System.out.println("city in service");
		return this.repo.save(entity);
	}

}
