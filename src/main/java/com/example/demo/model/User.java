package com.example.demo.model;

import java.util.List;
import java.util.UUID;

public class User {

    private final UUID id;

    private String username;

    private String password;
    private List<WeightLog> logs;
    public User(UUID id, String username, String password, List<WeightLog> logs) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.logs = logs;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() { return password; }

    public List<WeightLog> getLogs() {
        return logs;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogs(List<WeightLog> logs) {
        this.logs = logs;
    }
}
