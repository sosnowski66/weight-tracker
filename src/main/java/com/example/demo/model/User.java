package com.example.demo.model;

import java.util.List;
import java.util.UUID;

public class User {

    private final UUID id;
    private final String name;
    private List<WeightLog> logs;

    public User(UUID id, String name, List<WeightLog> logs) {
        this.id = id;
        this.name = name;
        this.logs = logs;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<WeightLog> getLogs() {
        return logs;
    }
}
