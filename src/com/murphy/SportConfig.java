package com.murphy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {


    @Bean // method name will be the bean id
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach ScratchCoach() {
        return new ScratchCoach(sadFortuneService());
    }
}
