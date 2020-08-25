package com.murphy;

public class ScratchCoach implements Coach {

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
}
