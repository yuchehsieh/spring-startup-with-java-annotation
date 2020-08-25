package com.murphy;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Rest Fortune Service";
    }
}
