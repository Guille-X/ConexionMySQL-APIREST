package com.panvdev.apirest_prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApirestPruebaApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "5050");
		SpringApplication.run(ApirestPruebaApplication.class, args);
	}

}
