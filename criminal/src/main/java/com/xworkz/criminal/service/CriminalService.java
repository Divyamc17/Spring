package com.xworkz.criminal.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.criminal.entity.CriminalEntity;

public interface CriminalService {

	boolean validateAndSave(CriminalEntity entity);
	
	default Optional<List<CriminalEntity>> findByNameOrJailName(String name, String jailName) {
		return Optional.empty();
}
}