package com.xworkz.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.GoldEntity;
import com.xworkz.service.GoldService;
@Component
public class GoldServiceImpl implements GoldService {
	@Autowired
	@Qualifier("goldRepository")
	private GoldRepository repo;
	@Override
	public boolean valiadateAndSave(GoldEntity entity) {
	System.out.println("gold in service");
		return this.repo.save(entity);
	}

}
