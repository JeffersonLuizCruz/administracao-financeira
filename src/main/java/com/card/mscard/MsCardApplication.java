package com.card.mscard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCardApplication.class, args);
	}

}
