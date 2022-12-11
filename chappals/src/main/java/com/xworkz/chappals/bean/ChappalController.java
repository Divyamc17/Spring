package com.xworkz.chappals.bean;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/save")
public class ChappalController {
public ChappalController() {
	System.out.println("ChappalController in default constr");
}

@PostMapping
public void onSend(ChappalEntity entity,HttpServletRequest request) {
	System.out.println("executig method");
	System.out.println("data is saved"+entity);
	if(entity.getPrice()>0 && entity.getSize()>0) {
		request.setAttribute("message", "chappal deatils is saved");
	}else {
		request.setAttribute("message", "chappal deatils is not saved");
		request.setAttribute("entity", entity);
	}
	
}
}
