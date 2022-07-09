package com.finsol.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieEurekaServiceApplication.class, args);
	}

}
