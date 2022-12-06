package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.FlagEntity;
@Component
public class FlagRepositoryImpl implements FlagRepository {

	@Override
	public boolean save(FlagEntity entity) {
		System.out.println("flag in repository");
		return false;
	}

}
