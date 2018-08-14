package com.example.servicefeignhystrix;

import org.springframework.stereotype.Component;

@Component
public class SayHiServiceWithHystrix implements SayHiService {
    @Override
    public String sayHiFromClient() {
        return "sorry,I am wrong";
    }
}
