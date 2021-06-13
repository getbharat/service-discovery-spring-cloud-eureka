package com.shop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {
	
	@Autowired
	private RestTemplate restClient;
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestClient() {
		return new RestTemplate();
	}

	@GetMapping("/makePayment/{price}")
	 public String inovokePayment(@PathVariable("price") int price) {
		
		String url = "http://payment-service/payment-provider/payNow/"+price;
		return 	restClient.getForObject(url, String.class);
	}	
}
