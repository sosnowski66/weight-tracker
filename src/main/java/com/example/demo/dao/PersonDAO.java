package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonDAO extends JpaRepository<Person, UUID> {
    Person findByUsername(String username);
}
