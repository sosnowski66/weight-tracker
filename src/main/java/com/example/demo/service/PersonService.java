package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.dao.WeightDAO;
import com.example.demo.model.Person;
import com.example.demo.model.WeightLog;

import java.time.LocalDate;
import java.util.*;

public class PersonService {

    private final PersonDAO userDAO;
    private final WeightDAO weightDAO;

    public PersonService(PersonDAO userDAO, WeightDAO weightDAO) {
        this.userDAO = userDAO;
        this.weightDAO = weightDAO;
    }

    public void addUser(Person person) {
        userDAO.save(person);
    }

    public void login(Person person) {

    }

    public Optional<Person> getUserById(UUID id) {
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
