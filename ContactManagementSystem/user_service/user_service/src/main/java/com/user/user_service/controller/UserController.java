package com.user.user_service.controller;

import com.user.user_service.entity.User;
import com.user.user_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable("userId") Long userId){
        User user = userService.getUser(userId);
        String url = "http://CONTACT-SERVICE/contact/user/";
        List contact = restTemplate.getForObject(url+user.getUserId(), List.class);
        user.setContact(contact);
        return new ResponseEntity<>(user, HttpStatusCode.valueOf(200));
    }
}
