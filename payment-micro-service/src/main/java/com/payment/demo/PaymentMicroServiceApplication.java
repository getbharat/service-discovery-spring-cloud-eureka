package com.payment.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMicroServiceApplication.class, args);
	}

}
