package com.user.user_service.entity;

import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String phone;
    private List<Contacts> contact;

    public User(Long userId, String name, String phone, List<Contacts> contact) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contact = contact;
    }

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public User(){}

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contacts> getContact() {
        return contact;
    }

    public void setContact(List<Contacts> contact) {
        this.contact = contact;
    }
}
