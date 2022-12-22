package com.xworkz.patient.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.patient.entity.PatientEntity;
import com.xworkz.patient.service.PatientService;

@Component
@RequestMapping("/send")
public class PatientController {
	@Autowired
	private PatientService service;

	public PatientController() {
		System.out.println("patient in PatientController");
	}

	@PostMapping
	public String onSend(PatientEntity entity, Model model, @RequestParam MultipartFile image) {
		System.out.println("executing the onSend method");
		String service = this.service.validateAndSave(entity);
		if (service.equals("success")) {
			model.addAttribute("message", "Patient Deatils Saved Sucessfully...");
			System.out.println("saving the data" + entity);
			if (image != null) {
				// Get the file and save it somewhere
				byte[] bytes;
				System.out.println("File original name" + image.getOriginalFilename());
				System.out.println("File size" + image.getSize());
				System.out.println("File type" + image.getContentType());
				String fileName=System.currentTimeMillis() + "_" + image.getOriginalFilename();
				try {
					bytes = image.getBytes();
					Path path = Paths
							.get("D:\\app-images\\" +fileName );
					Files.write(path, bytes);
					entity.setFileName(fileName);
				} catch (IOException e) {
					e.printStackTrace();
				}
				model.addAttribute("entity", entity);
			}
			return "save";
		} else {
			model.addAttribute("error", "Patient Deatils not saved");
			model.addAttribute("entity", entity);
		}

		return "index";

	}

	@GetMapping
	public String findByName(@RequestParam String name, @RequestParam int greaterThanAge,
			@RequestParam int lesserThanAge, Model model) {
		System.out.println("Name selected from UI" + name);
		Optional<List<PatientEntity>> optionalList = this.service.findByName(name, greaterThanAge, lesserThanAge);
		if (optionalList.isPresent() && optionalList.get().size() > 0) {
			System.out.println("Data is present ");
			List<PatientEntity> list = optionalList.get();
			System.out.println("Total List is found" + list.size());
			model.addAttribute("list", list);
		} else {
			System.out.println("Data is not present for " + name);
			model.addAttribute("message", "No Results found");

		}
		return "Search";
	}
	
	
	@GetMapping(value = "/files/{file_name}")
	//@ResponseBody 
	public void getFile(@PathVariable("file_name") String fileName,HttpServletResponse response) throws IOException {
		System.out.println("File name is "+fileName);
		//do other stuff
		Path path = Paths
				.get("D:\\app-images\\" +fileName);
	    byte[] file = Files.readAllBytes(path);
	    response.reset();
	    //response.setBufferSize(DEFAULT_BUFFER_SIZE);
	    response.setContentType("image/jpg"); //or whatever file type you want to send. 
	    try {
	        response.getOutputStream().write(file);
	    } catch (IOException e) {
	        // Do something
	    	e.printStackTrace();
	    }
	}
}
