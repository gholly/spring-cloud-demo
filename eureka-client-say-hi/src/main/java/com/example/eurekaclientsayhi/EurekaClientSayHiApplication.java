package com.example.eurekaclientsayhi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientSayHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientSayHiApplication.class, args);
	}


	@Value("${server.port}")
	String port;


	@RequestMapping("/hi")
	public String sayHi(){
		return "hi,I am port "+port;
	}
}
