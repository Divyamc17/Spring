package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.GoldEntity;

@Component
public interface GoldRepository {
	boolean save(GoldEntity entity);

}
