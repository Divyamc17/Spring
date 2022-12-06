package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.WaterEntity;
import com.xworkz.repository.WaterRepository;
@Component
public class WaterServiceImpl implements WaterService{
   @Autowired
   @Qualifier("waterRepository")
	private WaterRepository repo;
	@Override
	public boolean validateAndSave(WaterEntity entity) {
		System.out.println("water in service");
		return this.repo.save(entity);
	}

	
}
