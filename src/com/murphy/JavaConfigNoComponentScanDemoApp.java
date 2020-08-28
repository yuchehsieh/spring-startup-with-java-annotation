package com.murphy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigNoComponentScanDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);

        ScratchCoach coach = context.getBean("ScratchCoach", ScratchCoach.class);


        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortune());
        System.out.println("Email: " + coach.getEmail());
        System.out.println("Team: " + coach.getTeam());

        context.close();
    }
}
