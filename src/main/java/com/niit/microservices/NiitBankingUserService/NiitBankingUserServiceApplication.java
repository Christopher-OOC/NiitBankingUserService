package com.niit.microservices.NiitBankingUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NiitBankingUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiitBankingUserServiceApplication.class, args);
	}

}
