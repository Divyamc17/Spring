package com.xworkz.mall.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;
import com.xworkz.mall.repository.CustomerRopository;

@Component
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRopository repo;

	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<CustomerEntity>> validate = validator.validate(entity);
		if(validate.size()>0) {
			System.out.println("Error in data so please fix it");
		}else {
			System.out.println("Data is saves sucessfully");
			repo.save(entity);
		}

		return true;
	}

	@Override
	public boolean ValidateAndSave(CustomerFeedbackEntity entity) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<CustomerFeedbackEntity>> validate = validator.validate(entity);
		if(validate.size()>0) {
			System.out.println("Error in data so please fix it");
		}else {
			System.out.println("Data is saves sucessfully");
		repo.save(entity);
	}
    return true;
}
}
