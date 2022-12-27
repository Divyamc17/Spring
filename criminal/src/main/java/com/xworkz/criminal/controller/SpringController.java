package com.xworkz.criminal.controller;

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

import com.xworkz.criminal.entity.CriminalEntity;
import com.xworkz.criminal.service.CriminalService;

@Component
@RequestMapping("/criminal")
public class SpringController {
	@Autowired
	private CriminalService service;

	public SpringController() {
		System.out.println("SpringController in default");
	}

	@PostMapping
	public String onSend(CriminalEntity entity, Model model, @RequestParam MultipartFile image) {
		System.out.println("executing the onSend method");
		if (image != null) {
			// Get the file and save it somewhere
			byte[] bytes;
			System.out.println("File original name" + image.getOriginalFilename());
			System.out.println("File size" + image.getSize());
			System.out.println("File type" + image.getContentType());
			String fileName = System.currentTimeMillis() + "_" + image.getOriginalFilename();
			try {
				bytes = image.getBytes();
				Path path = Paths.get("D:\\app-images\\" + fileName);
				Files.write(path, bytes);
				entity.setFileName(fileName);
				entity.setFileSize(image.getSize());
				// entity.setFileType(image.getContentType());
				entity.setContentType(image.getContentType());
			} catch (IOException e) {
				e.printStackTrace();
			}
			model.addAttribute("entity", entity);
			boolean valid = this.service.validateAndSave(entity);
			if (valid) {
				model.addAttribute("message", "Criminal Details Saved Sucessfully");
				System.out.println("saving the data" + entity);
				model.addAttribute("entity", entity);
			}
				return "save";
			} else {
				model.addAttribute("error", "criminal details not sved");
				model.addAttribute("entity", entity);
				
			}
		return "index";
		}
		
	
	@GetMapping
	public String findByNameOrjailName(@RequestParam String name,@RequestParam String jailName,Model model)
	{
		System.out.println("name selected from UI"+name);
		//System.out.println("jailName selected from UI"+jailName);
		Optional<List<CriminalEntity>> optionalList= this.service.findByNameOrJailName(name,jailName);
		if(optionalList.isPresent() && optionalList.get().size()>0)
		{
			System.out.println("Data is present ");
			List<CriminalEntity> list=optionalList.get();
			System.out.println("Total List is found"+list.size());
			model.addAttribute("list", list);
			
			return "SearchResult";
		}
		else {
			System.out.println("Data is not present for "+name);
			//System.out.println("jailName selected from UI"+jailName);
			model.addAttribute("message", "No Results found");
			return "Search";
		}
	}

	@GetMapping(value = "/files/{file_name}")
	// @ResponseBody
	public void getFile(@PathVariable("file_name") String fileName, @RequestParam String contentType,
			HttpServletResponse response) throws IOException {
		System.out.println("File name is " + fileName);
		// do other stuff
		if (fileName != null && contentType != null) {
			Path path = Paths.get("D:\\app-images\\" + fileName);
			byte[] file = Files.readAllBytes(path);
			response.reset();
			// response.setBufferSize(DEFAULT_BUFFER_SIZE);
			response.setContentType(contentType); // or whatever file type you want to send.
			try {
				response.getOutputStream().write(file);
			} catch (IOException e) {
				// Do something
				e.printStackTrace();
			}
		}
	}

}