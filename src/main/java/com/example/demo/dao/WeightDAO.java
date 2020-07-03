package com.example.demo.dao;

import com.example.demo.model.WeightLog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.UUID;

public interface WeightDAO extends CrudRepository<WeightLog, UUID> {

    @Query("DELETE from weightdb d where d.date=:date")
    public void deleteByDate(Date date);
}
