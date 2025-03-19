package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contacts> db = List.of(
            new Contacts(1L,"harshveer7828gmail.com","Harsh veer singh",1L),
            new Contacts(2L,"Chandu420@gmail.com","Chandu agarwal",1L),
            new Contacts(1L,"docomo@gmail.com","Docomo",2L)
    );

    @Override
    public List<Contacts> getContactsOfUser(Long userId) {
        return db.stream().filter(contacts -> contacts.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
