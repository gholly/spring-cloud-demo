package com.example.serviceinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@SpringBootApplication
public class ServiceInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceInfoApplication.class, args);
	}


    @RequestMapping("/hi")
    public String home(){
        return "hi i'm information!";
    }

    @RequestMapping("/info")
    public String info(){
        return restTemplate.getForObject("http://localhost:9292/hh",String.class);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
