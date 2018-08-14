package com.example.serviceribbonhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrixDashboard
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class ServiceRibbonHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonHystrixApplication.class, args);
	}


	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
