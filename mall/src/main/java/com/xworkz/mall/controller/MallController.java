package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.entity.AdminEntity;
import com.xworkz.mall.service.MallService;

@Component
@RequestMapping("/mall")
public class MallController {

	@Autowired
	private MallService service;

	public MallController() {
		System.out.println("mall controller in default const");
	}

	@PostMapping
	public String onLogin(Model model, @RequestParam String adminName, @RequestParam String password) {
		System.out.println("running on login methos");
		AdminEntity findByAdminNameAndpassword = service.findByAdminNameAndpassword(adminName, password);
		AdminEntity findByName = service.findByName(adminName);
		if (findByAdminNameAndpassword == null || findByName == null) {
			System.out.println("Given Credential are invalid");
			model.addAttribute("error", "Credential are not matching");

			if (findByName.getAccountLocked().equals("locked")) {
				System.out.println("Account is locked");
				model.addAttribute("error", "your account is locked reset the password");
				return "adminPage";
			}
			return "adminPage";
		}
		if (findByAdminNameAndpassword != null) {
			if (findByAdminNameAndpassword.getAccountLocked().equals("unlocked")) {
				model.addAttribute("message", "credential are matched");
				return "customerDetails";
			}

			if (findByAdminNameAndpassword.getLoginCount() <=1) {
				System.out.println("Welcome to our page please change your password");
				model.addAttribute("message", "Congratulations you have in logged please chanfe your password");
				return "newPassword";
			}
			return "adminPage";
		}
		return "adminPage";
	}
}