package com.springmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication2 {

    public static void main(String[] args) {

        //Get application context where it has all the beans..
        ApplicationContext act = SpringApplication.run(DemoApplication2.class, args);


    }

}

