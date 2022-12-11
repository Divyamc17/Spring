package com.xworkz.bikeshowroom.bean;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/save")
public class BikeShowRoomController {
	
	public BikeShowRoomController() {
		System.out.println("BikeShowRoomController deft");
	}
   @PostMapping
	public void onSend(BikeShowRoomEntity entity,HttpServletRequest request) {
		System.out.println("executiong onSend");
		System.out.println("showing data of bike"+entity);
		request.setAttribute("message", "Data Saved sucessfully");
	}
}
