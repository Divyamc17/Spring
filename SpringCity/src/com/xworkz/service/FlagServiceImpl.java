package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FlagEntity;
import com.xworkz.repository.FlagRepository;
@Component
public class FlagServiceImpl implements FlagService {
@Autowired
@Qualifier("flagRepository")
private FlagRepository repo;
	@Override
	public boolean validateAndSave(FlagEntity entity) {
		System.out.println("flag in service");
		return this.repo.save(entity);
	}

}
