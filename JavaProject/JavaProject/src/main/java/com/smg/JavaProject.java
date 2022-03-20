package com.smg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.smg")
public class JavaProject {

	public static void main(String[] args) {
		SpringApplication.run(JavaProject.class, args);
	}

}
