package com.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerGatewayApplication.class, args);
	}

}
