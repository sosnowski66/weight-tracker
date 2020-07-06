package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserDAO userDAO;

    public UserDetailsServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.findByUsername(username);

        if (user == null) throw new UsernameNotFoundException(username);

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), null);

    }
}
