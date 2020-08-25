package com.murphy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigNoComponentScanDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("ScratchCoach", Coach.class);


        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortune());

        context.close();
    }
}
