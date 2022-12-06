package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.PlanetEntity;
import com.xworkz.repository.PlanetRepository;
@Component
public class PlanetServiceImpl implements PlanetService {
    @Autowired
    @Qualifier("planetRepository")
	private PlanetRepository repo;
	
	@Override
	public boolean validateAndSave(PlanetEntity entity) {
     System.out.println("planet in service");
		return this.repo.save(entity);
	}

}
