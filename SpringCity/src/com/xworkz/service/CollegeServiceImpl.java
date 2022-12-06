package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.CollegeEntity;
import com.xworkz.repository.CollegeRepository;
@Component
public class CollegeServiceImpl implements CollegeService {
@Autowired
@Qualifier("collegeRepository")
private CollegeRepository repo; 
	@Override
	public boolean validateAndSave(CollegeEntity entity) {
		System.out.println("college in service");
		return this.repo.save(entity);
	}

}
