package com.example.servicefeignhystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client-say-hi",fallback = SayHiServiceWithHystrix.class)
public interface SayHiService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClient();


}
