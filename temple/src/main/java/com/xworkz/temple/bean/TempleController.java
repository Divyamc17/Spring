package com.xworkz.temple.bean;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/send")
public class TempleController {
	
	public TempleController() {
    System.out.println("temple in default constr");
	}
	@PostMapping
	public String onSend(TempleEntity entity, HttpServletRequest request){
		System.out.println("executing on send" );
		System.out.println("saving the data"+entity);
	   if(entity.getFees()>0) {	
		request.setAttribute("message", "Temple details is saved");
	   }else {
		request.setAttribute("error", "Temple details are not saved");
		request.setAttribute("entity", "entity");
	   }
		return "index.jsp";
		
	}

}
