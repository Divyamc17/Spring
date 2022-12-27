package com.xworkz.criminal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.criminal.entity.CriminalEntity;
import com.xworkz.criminal.repository.CriminalRepository;

@Component
public class CriminalServiceImpl implements CriminalService {
	@Autowired
	private CriminalRepository repo;

	@Override
	public boolean validateAndSave(CriminalEntity entity) {
		System.out.println("criminal in CriminalSrviceImpl");
		return this.repo.save(entity);
	}
  @Override
public Optional<List<CriminalEntity>> findByNameOrJailName(String name, String jailName) {
	System.out.println("criminal in CriminalServiceImpl");
	return this.repo.findByNameOrJailName(name, jailName);
}
   
}
