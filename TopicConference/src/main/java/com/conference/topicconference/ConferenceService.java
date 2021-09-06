package com.conference.topicconference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService {

    @Autowired
    private TopicDao topicDao;

    public boolean addTopic(String title, double duration) {
        try {
            topicDao.addTopic(title, duration);
            return true;
        } catch (DuplicateKeyException ex) {
            return false;
        }
    }
    public Topic getTopic(String title) {
        return topicDao.getTopics(title);
    }

    public List<Topic> getAllTopic() {
        return topicDao.getAllTopics();
    }

}
