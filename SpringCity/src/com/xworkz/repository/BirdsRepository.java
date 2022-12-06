package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.BirdsEntity;
@Component
public interface BirdsRepository {
	boolean save(BirdsEntity entity);

}
