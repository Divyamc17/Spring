package com.xworkz.temple.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.temple.entity.TempleEntity;


public interface TempleRepository {

	boolean save(TempleEntity entity);
	
	default Optional<List<TempleEntity>> findByGod(String god)
	{
		return Optional.empty();
	}
	
	
}
