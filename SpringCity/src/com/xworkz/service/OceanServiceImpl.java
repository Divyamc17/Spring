package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.OceanEntity;
import com.xworkz.repository.OceanRepository;
@Component
public class OceanServiceImpl implements OceanService {
   @Autowired
   @Qualifier("oceanRepository")
	private OceanRepository repo;
	
	@Override
	public boolean validateAndSave(OceanEntity entity) {
		System.out.println("ocean in service");
		return this.repo.save(entity);
	}

}
