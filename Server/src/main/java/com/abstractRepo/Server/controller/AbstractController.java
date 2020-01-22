package com.abstractRepo.Server.controller;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abstractRepo.Server.service.WelcomeService;

@RestController

public class AbstractController {
	
	 @Inject WelcomeService service;
	 
	
	@RequestMapping("/welcome")
	public String AbstractStart() {
		
		  service.Service(); 
		  return ResponseEntity.ok(service.getOutput()).toString();
		 
		
		
	}
}
