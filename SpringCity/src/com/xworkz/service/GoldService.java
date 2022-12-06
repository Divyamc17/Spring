package com.xworkz.service;

import org.springframework.stereotype.Component;

import com.xworkz.dto.GoldEntity;
@Component
public interface GoldService {
 boolean valiadateAndSave(GoldEntity entity);
}
