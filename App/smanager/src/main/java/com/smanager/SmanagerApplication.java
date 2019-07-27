package com.smanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmanagerApplication.class, args);
	}
}
