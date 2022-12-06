package com.xworkz.repository;


import org.springframework.stereotype.Component;

import com.xworkz.dto.WaterEntity;
@Component
public class WaterRepositoryImpl implements WaterRepository {


	@Override
	public boolean save(WaterEntity entity) {
    System.out.println("water in repository");
		return false;
	}

}
