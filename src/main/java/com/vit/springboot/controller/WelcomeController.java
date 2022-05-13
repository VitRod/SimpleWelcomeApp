package com.vit.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vit.springboot.service.AdditionalService;
import com.vit.springboot.service.BasicService;
import com.vit.springboot.service.WelcomeService;

@RestController
public class WelcomeController {
	                                        
	@Autowired
	private WelcomeService service;
	
	@Autowired
	private BasicService basicService;
	
	@Autowired
	private AdditionalService additionalService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}  
	                               
	@RequestMapping("/dynamic-configuration")
	public String dynamicConfiguration(){		
		String message = basicService.getMessage();
		int number = basicService.getNumber();
		boolean value = basicService.isValue();   
		
		String result = "Details submitted by you: Message: " + message + ", Number: " + number  + ", Value: "  +value;
		
		return result;
	
	}
	
	@RequestMapping("/additional-configuration")
	public Map<String, Object> additionalConfiguration(){
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("message", additionalService.getMessage());
		map.put("number", additionalService.getNumber());
		map.put("value", additionalService.isValue());
		
		return map;
	
	}
	
}

