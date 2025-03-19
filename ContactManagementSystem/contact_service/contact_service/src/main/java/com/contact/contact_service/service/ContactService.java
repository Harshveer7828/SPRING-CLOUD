package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contacts;

import java.util.List;

public interface ContactService {

    public List<Contacts> getContactsOfUser(Long userId);
}
