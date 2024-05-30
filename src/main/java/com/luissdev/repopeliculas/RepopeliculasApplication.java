package com.luissdev.repopeliculas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepopeliculasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RepopeliculasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Bienvenido a Spring Boot");
	}
}
