package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.OceanEntity;

@Component
public interface OceanRepository {
	boolean save(OceanEntity entity);

}
