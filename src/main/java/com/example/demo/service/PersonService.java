package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.dao.WeightDAO;
import com.example.demo.model.User;
import com.example.demo.model.WeightLog;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class PersonService {

    private final UserDAO userDAO;
    private final WeightDAO weightDAO;

    public PersonService(UserDAO userDAO, WeightDAO weightDAO) {
        this.userDAO = userDAO;
        this.weightDAO = weightDAO;
    }

    public void addUser(User user) {
        userDAO.save(user);
    }

    public void login(User user) {

    }

    public Optional<User> getUserById(UUID id) {
        return userDAO.findById(id);
    }

    //LOGI
    public void addLog(UUID id, double log, String date) {
        LocalDate dateS = LocalDate.parse(date);
        weightDAO.save(new WeightLog(id, dateS, log));
    }

    public List<WeightLog> getUserLogsById(UUID id) {
        List<UUID> ids = new ArrayList<>();
//        ids.add();
        Iterable<UUID> iterable = ids;
//          weightDAO.findAllById(ids.iterator());
//        return StreamSupport.stream(weightDAO.findAllById(ids).spliterator(), false)
//                .collect(Collectors.toList());
        return null;
    }

    public void deleteLogByDate(String dateOfLog) {

    }




}
