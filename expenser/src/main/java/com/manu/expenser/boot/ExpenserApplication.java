package com.manu.expenser.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.manu.expenser" })
public class ExpenserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenserApplication.class, args);
	}
}
