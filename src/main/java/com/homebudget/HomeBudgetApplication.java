package com.homebudget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HomeBudgetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeBudgetApplication.class, args);
	}
}
