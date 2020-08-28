package com.murphy;

import org.springframework.beans.factory.annotation.Value;

public class ScratchCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;

    public ScratchCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice scratch skill for 30 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
