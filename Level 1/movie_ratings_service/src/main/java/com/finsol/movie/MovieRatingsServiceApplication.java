package com.finsol.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//http://localhost:8083/swagger-ui.html
@SpringBootApplication
@EnableEurekaClient
public class MovieRatingsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingsServiceApplication.class, args);
	}

}
