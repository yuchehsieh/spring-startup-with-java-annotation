package com.murphy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from the container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        // call a method on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        // close context
        context.close();
    }
}
