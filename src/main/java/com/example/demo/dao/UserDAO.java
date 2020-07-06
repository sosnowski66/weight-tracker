package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserDAO extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
