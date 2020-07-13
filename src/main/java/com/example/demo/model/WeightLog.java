package com.example.demo.model;

import java.time.LocalDate;
import java.util.UUID;

public class WeightLog {

    private final UUID id;
    private final LocalDate date;
    private final double weight;

    public WeightLog(UUID id, LocalDate date, double weight) {
        this.id = id;
        this.date = date;
        this.weight = weight;
    }

}
