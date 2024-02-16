package com.team4.adproject.Repository;

import com.team4.adproject.Model.Record;
import com.team4.adproject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface RecordRepository extends JpaRepository<Record, Integer> {


    Record findByDateAndUser(Date date, User user);
}