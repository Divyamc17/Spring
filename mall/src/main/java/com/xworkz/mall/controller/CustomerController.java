package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;
import com.xworkz.mall.service.CustomerService;

@Component
@RequestMapping("/send")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@PostMapping
	public String onSend(CustomerEntity entity,Model model,CustomerFeedbackEntity entity2) {
		System.out.println("executing the onSend method");
		boolean validateAndSave = service.validateAndSave(entity);
		boolean validateAndSave2 = service.ValidateAndSave(entity2);
		if(validateAndSave && validateAndSave2) {
			model.addAttribute("message", "saved sucessfully....");
			model.addAttribute("entity",entity );
			model.addAttribute("entity2",entity2 );
			return "customerDetailsSave";
		}
		else {
			model.addAttribute("message", "Data is not saved");
			
		}
	
		return "customerDetails";
		
	}
	

}
