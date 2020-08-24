package com.murphy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from the container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on bean
        System.out.println(theCoach.getDailyWorkout());

        // close context
        context.close();
    }
}
