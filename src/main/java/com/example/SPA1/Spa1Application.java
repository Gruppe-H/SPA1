package com.example.SPA1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.example", "com.example.SPA1"})
public class Spa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spa1Application.class, args);
	}

}
