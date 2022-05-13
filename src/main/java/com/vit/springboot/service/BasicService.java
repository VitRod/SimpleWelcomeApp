package com.vit.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties("basic")
public class BasicService {
	
	@Value("${basic.value}")
	private boolean value;
	
	@Value("${basic.message}")
	private String message;
	
	@Value("${basic.number}")
	private int number;
	
	public boolean isValue() {
		return value;
	}
   
	public void setValue(boolean value) {
		this.value = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
