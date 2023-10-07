package com.cp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.cp.model"})
public class SaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaProjectApplication.class, args);
	}

}
