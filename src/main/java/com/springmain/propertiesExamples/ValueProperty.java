package com.springmain.propertiesExamples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by valla10 on 12/28/18.
 */

@Component
public class ValueProperty {

    //Value annotation to read external properties.. by default read from app.props spring profile..
    @Value("${vivek.props.name}")
    private String name;

    public void call(){
        System.out.println(name);
    }
}
