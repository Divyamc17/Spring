package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.BirdsEntity;
import com.xworkz.repository.BirdsRepository;
@Component
public class BirdsServiceImpl implements BirdsService {
   @Autowired
   @Qualifier("birdsRepository")
	private BirdsRepository repo;
	@Override
	public boolean validateAndSave(BirdsEntity entity) {
     System.out.println("birds in service");
		return this.repo.save(entity);
	}

}
