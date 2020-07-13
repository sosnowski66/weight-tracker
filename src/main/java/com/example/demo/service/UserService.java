package com.example.demo.service;

import com.example.demo.model.Person;

public interface UserService {

    void save(Person person);

    Person findByUsername(String username);
}
