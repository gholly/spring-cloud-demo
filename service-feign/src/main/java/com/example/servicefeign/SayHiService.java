package com.example.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client-say-hi")
public interface SayHiService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClient();


}
