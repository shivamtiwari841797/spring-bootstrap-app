package com.conference.topicconference;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@Repository
public class TopicDaoImpl implements  TopicDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addTopic(String title, double duration) {
        String sql = "insert into topics values(?,?, ?)";
        jdbcTemplate.update(sql, Math.random() * 100, title, duration);
    }

    @Override
    public Topic getTopics(String title) {
        String sql = "select * from topics where title = '" + title +"'";
        return jdbcTemplate.queryForObject(sql, new Topicmapper());
    }


    @Override
    public boolean topicExists(String title) {
        return (getTopics(title)==null);
    }

    @Override
    public List<Topic> getAllTopics() {
        String sql = "select * from topics";
        return jdbcTemplate.query(sql, new Topicmapper());
    }
}

class Topicmapper implements RowMapper<Topic> {

    @Override
    public Topic mapRow(ResultSet resultSet, int i) throws SQLException {
        Topic topic = new Topic();
        topic.setId(resultSet.getInt("id"));
        topic.setTitle(resultSet.getString("title"));
        topic.setDuration(resultSet.getDouble("duration"));
        return topic;
    }
}
