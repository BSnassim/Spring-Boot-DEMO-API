package com.nassim.Employes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EmployesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployesApplication.class, args);
		System.out.println("Server is up and running");
	}

}
