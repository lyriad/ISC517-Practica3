package com.isc517.practica3.isc517practica3;

import com.isc517.practica3.isc517practica3.Services.SecurityService;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		SecurityService securityService = (SecurityService) applicationContext.getBean("securityService");
		securityService.createAdminUser();
		securityService.createUser();
	}

}
