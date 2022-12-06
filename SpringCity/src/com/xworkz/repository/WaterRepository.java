package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.WaterEntity;

@Component
public interface WaterRepository {
	boolean save(WaterEntity entity);

}
