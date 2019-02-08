package com.springmain;

import com.springmain.DIExamples.CountryMain;
import com.springmain.QualifierExamples.CountryInterface;
import com.springmain.QualifierExamples.USA;
import com.springmain.propertiesExamples.PropertiesTest;
import com.springmain.propertiesExamples.ValueProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //Get application context where it has all the beans..
        ApplicationContext act = SpringApplication.run(DemoApplication.class, args);

        //Get the bean of the class or with bean name..instance.
        act.getBean(HelloWorld.class).printHello();

        //Default it will call primary bean implementation for the interface...
        act.getBean(CountryInterface.class).countryName();

        //TO call USA bean instance
        USA usa = act.getBean(USA.class);
        usa.countryName();

        act.getBean(CountryMain.class).call();

        //Below bean will get executed when measure profile is called.. by default it will not get called.
        //With measure profile , measure profile beans and default beans will get called.
        //act.getBean(Measure.class).call();

        //Read Bean confoguration based on properties..
        System.out.println(act.getBean(PropertiesTest.class).getName());

        //Call bean and property value..
        act.getBean(ValueProperty.class).call();

    }

}

