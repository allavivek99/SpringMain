package com.springmain;

import org.springframework.stereotype.Component;

/**
 * Created by valla10 on 12/25/18.
 */
@Component
public class HelloWorld {

    public void printHello(){
        System.out.println("Hello Spring");
    }

    public int printInt(){
        return 1;
    }
}
