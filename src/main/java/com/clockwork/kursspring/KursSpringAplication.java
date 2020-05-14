package com.clockwork.kursspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KursSpringAplication {

    public static void main(String[] args) {

        SpringApplication.run(KursSpringAplication.class,args);

       // ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(KursSpringAplication.class,args);
       // KnightRepository castle = (KnightRepository) configurableApplicationContext.getBean("castle");
       // System.out.println(castle);
    }

}
