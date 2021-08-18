package com.spring.boot.research;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class SpringBootResearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootResearchApplication.class, args);

	}

}
