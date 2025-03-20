package com.example.web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;


import java.util.logging.Logger;

@RestController
public class WebController {
    private Logger LOG = Logger.getLogger(WebController.class.getName());

    private NameService nameService;
    private GreetingService greetingService;

    WebController(NameService nameService, GreetingService greetingService){
        this.greetingService = greetingService;
        this.nameService = nameService;
    }

    @RequestMapping()
    public String index(HttpServletRequest request){
        String locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request).toLanguageTag();
        String greeting = String.valueOf(new StringBuilder().append(greetingService.getGreeting(locale)).append(" ").append(nameService.getName().toString()));
        return greeting;
    }



}
