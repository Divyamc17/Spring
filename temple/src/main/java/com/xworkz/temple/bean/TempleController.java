package com.xworkz.temple.bean;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.service.TempleService;

@Component
@RequestMapping("/send")
public class TempleController {
	@Autowired
	private TempleService service;

	public TempleController() {
		System.out.println("temple in default constr");
	}

	@PostMapping
	public String onSend(TempleEntity entity, HttpServletRequest request) {
		System.out.println("executing on send");
		boolean valid = service.validateAndSave(entity);
		if (valid) {
			request.setAttribute("message", "Temple details is saved");
			System.out.println("saving the data" + entity);
		} else {
			request.setAttribute("error", "Temple details are not saved");
			request.setAttribute("entity", entity);
		}
		return "index";

	}
	
	
	@GetMapping
	public String findByGod(@RequestParam String god,Model model)
	{
		System.out.println("God selected from UI"+god);
		Optional<List<TempleEntity>> optionalList= this.service.findByGod(god);
		if(optionalList.isPresent() && optionalList.get().size()>0)
		{
			System.out.println("Data is present ");
			List<TempleEntity> list=optionalList.get();
			System.out.println("Total List is found"+list.size());
			model.addAttribute("list", list);
			
			return "SearchResult";
		}
		else {
			System.out.println("Data is not present for "+god);
			model.addAttribute("message", "No Results found");
			return "Search";
		}
	}
	
	

}
