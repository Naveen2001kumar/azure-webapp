package com.naveen.naveenwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan
public class NaveenWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaveenWebappApplication.class, args);

	}

}
