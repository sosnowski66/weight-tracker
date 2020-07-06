package com.example.demo.dao;

import com.example.demo.model.WeightLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface WeightDAO extends JpaRepository<WeightLog, Long> {

    @Query("SELECT * FROM logs d WHERE d.user_id=:id")
     public List<WeightLog> findAllByUserId(UUID id);
//    @Query("DELETE from weightdb d where d.date=:date")
//    public void deleteByDate(Date date);
}
