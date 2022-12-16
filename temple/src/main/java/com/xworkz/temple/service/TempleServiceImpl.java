package com.xworkz.temple.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepository;

@Component
public class TempleServiceImpl implements TempleService {
	@Autowired
	private TempleRepository repo;

	@Override
	public boolean validateAndSave(TempleEntity entity) {
		System.out.println("temple in TempleServiceImpl");
		return this.repo.save(entity);
	}

	@Override
	public Optional<List<TempleEntity>> findByGod(String god) {
		return this.repo.findByGod(god);
	}

}
