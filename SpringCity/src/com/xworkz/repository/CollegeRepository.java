package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.CollegeEntity;
@Component
public interface CollegeRepository {
	boolean save(CollegeEntity entity);

}
