package com.murphy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (coach == alphaCoach);
        System.out.println("Pointing to the same object: " + result);

        System.out.println("Memory Location for coach: " + coach);
        System.out.println("Memory Location for alphaCoach: " + alphaCoach);
        System.out.println(coach.getFortune());



        context.close();
    }
}
