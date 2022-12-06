package com.xworkz.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dto.GoldEntity;
@Component
public class GoldRepositoryImpl implements GoldRepository {

	
	@Override
	public boolean save(GoldEntity entity) {
		System.out.println("gold in repository"); 
		return false;
	}

}
