package com.example.serviceribbonhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "errorMsg")
    public String hiService() {
        return restTemplate.getForObject("http://EUREKA-CLIENT-SAY-HI/hi", String.class);
    }


    public String errorMsg(){
        return "I am ribbon with hystrix,Wrong!";
    }
}
