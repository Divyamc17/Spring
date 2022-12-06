package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.CityEntity;
@Component
public interface CityRepository {
	boolean save(CityEntity entity);
}
