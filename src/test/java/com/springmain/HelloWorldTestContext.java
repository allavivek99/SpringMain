package com.springmain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by valla10 on 2/2/19.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class HelloWorldTestContext {

    @Autowired
    ApplicationContext applicationContext;

    //Mock Bean in Spring , to mock a particular bean in application context..

    @MockBean
    HelloWorld helloWorld;

    @Test
    public void test() {
        //Another way to get bean in test is to autowire Application Context and get the Bean.
        //applicationContext.getBean(HelloWorld.class).printHello();

        Mockito.when(helloWorld.printInt()).thenReturn(2);

        System.out.println(helloWorld.printInt());

    }
}
