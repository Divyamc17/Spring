package com.xworkz.temple.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.temple.entity.TempleEntity;

public interface TempleService {
	
	boolean validateAndSave(TempleEntity entity);

	default Optional<List<TempleEntity>> findByGod(String god)
	{
		return Optional.empty();
	}
	
}
