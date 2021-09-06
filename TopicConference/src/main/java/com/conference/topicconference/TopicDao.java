package com.conference.topicconference;

import java.util.List;

public interface TopicDao {
    void addTopic(String title, double duration); //DOES NOT ALLOW DUPLICATION
    Topic getTopics(String title);
    boolean topicExists(String title); //true if exists, false if not present
    List<Topic> getAllTopics();

}
