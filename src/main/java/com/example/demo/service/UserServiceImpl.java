package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.dao.WeightDAO;
import com.example.demo.model.User;
import com.example.demo.model.WeightLog;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.*;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO;
    private WeightDAO weightDAO;
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        List<UUID> ids = new ArrayList<>();
        ids.add(user.getId());

        List<WeightLog> logs = weightDAO.findAllByUserId(user.getId());


        user.setLogs(List.of(weightDAO.findAllById(ids)));
    }
        
    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }
}
