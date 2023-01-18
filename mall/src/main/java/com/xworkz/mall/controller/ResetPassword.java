package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.entity.AdminEntity;
import com.xworkz.mall.service.MallService;

@Controller
@RequestMapping("/reset")
public class ResetPassword {

	@Autowired
	private MallService service;

	public ResetPassword() {
		System.out.println("ResetPassword in default constr ");
	}

	@GetMapping
	public String onForget(@RequestParam String name, Model model) {
		AdminEntity findByMallName = service.findByMallName(name);
		if (findByMallName!= null) {

			model.addAttribute("message", "password is sent to your mail id");
			return "newPassword";
		} else {
			if (findByMallName == null) {
				model.addAttribute("error", "selected mall is not founfd");
				return "resetPassword";
			}
		}
		return null;
	}
}