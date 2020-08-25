package com.murphy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String emailAddress;

    @Value("${foo.team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Swim 500m for exercising";
    }

    @Override
    public String getFortune() {
        System.out.println("Swim Coach: email - " + this.getEmailAddress());
        System.out.println("Swim Coach: team - " + this.getTeam());
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
