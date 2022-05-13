package com.vit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleWelcomeAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SimpleWelcomeAppApplication.class, args);
		System.out.println(ctx);
	}

}
