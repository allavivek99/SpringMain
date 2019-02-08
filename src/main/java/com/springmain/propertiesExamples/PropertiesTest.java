package com.springmain.propertiesExamples;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by valla10 on 12/28/18.
 */

@Configuration
@ConfigurationProperties(prefix = "vivek.props")
public class PropertiesTest {

    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
