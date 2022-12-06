package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.FlagEntity;

@Component
public interface FlagRepository {
 boolean save(FlagEntity entity);
}
