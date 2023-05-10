package it.disim.univaq.sose.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OpenjobApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenjobApplication.class, args);
	}

}
