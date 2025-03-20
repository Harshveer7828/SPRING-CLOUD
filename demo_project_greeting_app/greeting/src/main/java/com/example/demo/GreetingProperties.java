package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "greeting")
public class GreetingProperties {
    private String greeting;
    private Map<String, String> greetings;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Map<String, String> getGreetings() {
        return greetings;
    }

    public void setGreetings(Map<String, String> greetings) {
        this.greetings = greetings;
    }
}
