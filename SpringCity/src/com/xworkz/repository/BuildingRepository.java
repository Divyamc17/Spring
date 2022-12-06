package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.BuildingEntity;

@Component
public interface BuildingRepository {
boolean save(BuildingEntity entity);
}
