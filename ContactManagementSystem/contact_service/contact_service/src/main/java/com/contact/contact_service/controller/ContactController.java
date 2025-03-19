package com.contact.contact_service.controller;

import com.contact.contact_service.entity.Contacts;
import com.contact.contact_service.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Contacts>> getContacts(@PathVariable("userId") Long userId){
        List<Contacts> contact = contactService.getContactsOfUser(userId);
        return new ResponseEntity<>(contact, HttpStatusCode.valueOf(200));
    }
}
