package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
public class Person {

    private final UUID id;

    private String username;
    private String name;

    private String password;
    private List<WeightLog> logs;
    public Person(UUID id, String username, String password, List<WeightLog> logs) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.logs = logs;
    }
}
