package com.mindtree.Campsumind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mindtree") 
public class CampsumindApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampsumindApplication.class, args);
	}

}
