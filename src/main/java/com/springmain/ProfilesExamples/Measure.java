package com.springmain.ProfilesExamples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by valla10 on 12/27/18.
 */
@Component
@Profile({"measure"})
public class Measure {

    public void call(){
        System.out.println("Measure Call");
    }
}
