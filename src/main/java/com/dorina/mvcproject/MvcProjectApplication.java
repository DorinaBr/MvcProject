package com.dorina.mvcproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dorina.mvcproject.**")
public class MvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcProjectApplication.class, args);
	}

}
