package com.murphy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println("TennisCoach: inside doSomeCrazyStuff() method");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
