package com.springmain.QualifierExamples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by valla10 on 12/25/18.
 */

@Component
@Qualifier("usa")
public class USA implements CountryInterface {

    @Override
    public void countryName() {
        System.out.println("USA");
    }
}
