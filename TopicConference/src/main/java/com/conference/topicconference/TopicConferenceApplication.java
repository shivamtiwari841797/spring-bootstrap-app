package com.conference.topicconference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopicConferenceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TopicConferenceApplication.class, args);
    }

    @Autowired
    private ConferenceService conferenceService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(conferenceService.addTopic("t-1", 1.2));
        System.out.println(conferenceService.addTopic("t-3", 2.0));
        System.out.println(conferenceService.getTopic("t-1"));
        System.out.println(conferenceService.getAllTopic());
    }
}
