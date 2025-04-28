package com.model.meil_sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeilSenderApplication {
	String hola="salud ";

	public static void main(String[] args) {
		SpringApplication.run(MeilSenderApplication.class, args);
	}

}