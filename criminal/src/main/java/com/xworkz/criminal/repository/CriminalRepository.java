package com.xworkz.criminal.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.criminal.entity.CriminalEntity;

public interface CriminalRepository {

	boolean save(CriminalEntity entity);
	
	default Optional<List<CriminalEntity>> findByNameOrJailName(String name, String jailName) {
		return Optional.empty();
}
}