package com.spring.project.carparking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.web.bind.annotation.CrossOrigin;


import com.spring.project.carparking.slot.CarparkingSlotResource;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@ComponentScan()
@EnableSwagger2
@CrossOrigin(origins="*")


public class CarparkingApplication {
																																																																																												
	public static void main(String[] args) {
		SpringApplication.run(CarparkingApplication.class, args);
	}	
	}
