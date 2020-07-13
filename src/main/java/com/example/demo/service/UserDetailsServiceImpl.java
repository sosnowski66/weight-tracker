package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    private final PersonDAO userDAO;

    public UserDetailsServiceImpl(PersonDAO userDAO) {
        this.userDAO = userDAO;
    }

    public PersonDAO getUserDAO() {
        return userDAO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = userDAO.findByUsername(username);

        if (person == null) throw new UsernameNotFoundException(username);

        return new org.springframework.security.core.userdetails.User(person.getUsername(), person.getPassword(), null);

    }
}
