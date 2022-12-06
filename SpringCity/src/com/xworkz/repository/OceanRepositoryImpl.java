package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.OceanEntity;
@Component
public class OceanRepositoryImpl implements OceanRepository {

	@Override
	public boolean save(OceanEntity entity) {
		System.out.println("Ocean in repository");
		return false;
	}

}
