package com.xworkz.mall.service;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;

public interface CustomerService {
	
	boolean validateAndSave(CustomerEntity entity);

	boolean ValidateAndSave(CustomerFeedbackEntity entity);

}
