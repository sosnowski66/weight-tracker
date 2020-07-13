package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.dao.WeightDAO;
import com.example.demo.model.Person;
import com.example.demo.model.WeightLog;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.*;

public class UserServiceImpl implements UserService {

    private PersonDAO userDAO;
    private WeightDAO weightDAO;
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void save(Person person) {
        person.setPassword(bCryptPasswordEncoder.encode(person.getPassword()));
        List<UUID> ids = new ArrayList<>();
        ids.add(person.getId());

        List<WeightLog> logs = weightDAO.findAllByUserId(person.getId());


//        user.setLogs(List.of(weightDAO.findAllById()));
    }
        
    @Override
    public Person findByUsername(String username) {
        return userDAO.findByUsername(username);
    }
}
