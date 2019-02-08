package com.springmain.DIExamples;

import com.springmain.QualifierExamples.CountryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by valla10 on 12/25/18.
 */
@Component
public class CountryMain {

    private CountryInterface countryInterface;

    //Constructor Injection...


//    //Calling india class instance...
//    @Autowired
//    public CountryMain(@Qualifier("india") CountryInterface countryInterface) {
//        this.countryInterface = countryInterface;
//    }

    //Calling default primary class instance...
    @Autowired
    public CountryMain(CountryInterface countryInterface) {
        this.countryInterface = countryInterface;
    }

    public void call() {
        countryInterface.countryName();
    }
}
