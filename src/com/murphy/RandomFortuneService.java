package com.murphy;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "1 First Fortune",
            "2 Second Fortune",
            "3 Third Fortune"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);

        return data[index];
    }
}
