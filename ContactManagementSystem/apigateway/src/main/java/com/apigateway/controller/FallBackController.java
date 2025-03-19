package com.apigateway.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @RequestMapping("/userServiceFallback")
    public ResponseEntity<String> userServiceFallBack(){
        return new ResponseEntity<>("This service is down at this moment!!", HttpStatusCode.valueOf(503));
    }

    @RequestMapping("/contactServiceFallback")
    public ResponseEntity<String> contactServiceFallBack(){
        return new ResponseEntity<>("This service is down at this moment!!", HttpStatusCode.valueOf(503));
    }
}
