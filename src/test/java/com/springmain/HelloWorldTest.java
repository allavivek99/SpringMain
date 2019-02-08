package com.springmain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by valla10 on 2/2/19.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class HelloWorldTest {

    @Autowired
    HelloWorld helloWorld;

    @Test
    public void test(){
        helloWorld.printHello();
    }
}
