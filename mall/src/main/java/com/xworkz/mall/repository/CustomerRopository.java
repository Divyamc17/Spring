package com.xworkz.mall.repository;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;

public interface CustomerRopository {

	boolean save(CustomerEntity entity);
	
	boolean save(CustomerFeedbackEntity entity);
}
