package com.example.name;

import org.springframework.context.annotation.Configuration;

@Configuration

public class NameProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
