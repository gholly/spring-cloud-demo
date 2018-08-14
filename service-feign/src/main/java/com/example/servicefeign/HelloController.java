package com.example.servicefeign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {




    @Autowired
    SayHiService sayHiService;

    @RequestMapping("/hi")
    public String sayHi(){
        return sayHiService.sayHiFromClient();
    }
}
