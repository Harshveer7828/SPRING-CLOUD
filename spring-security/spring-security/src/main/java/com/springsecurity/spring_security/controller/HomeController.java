package com.springsecurity.spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String home(HttpServletRequest request){
        // return the session id
        return "Welcome home + " + request.getSession().getId();
    }
}
