package com.company.day04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(int id, String name, int age) {
        String query = "insert into person values(?, ?, ?)";
        jdbcTemplate.update(query, id, name, age);
    }
}
