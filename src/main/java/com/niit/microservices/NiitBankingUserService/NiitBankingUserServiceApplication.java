package com.niit.microservices.NiitBankingUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;

@EnableDiscoveryClient
@SpringBootApplication
public class NiitBankingUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiitBankingUserServiceApplication.class, args);
	}
    // new ParameterizedTypeReference<>
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
