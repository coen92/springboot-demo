package com.coen92.projects.web.springbootfirstproject.service;

import com.coen92.projects.web.springbootfirstproject.api.TopicRepository;
import com.coen92.projects.web.springbootfirstproject.implement.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
//        Topic result = topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
//        for(int i =0; i< topics.size(); i++) {
//            Topic t = topics.get(i);
//
//            if(t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
//        topics.removeIf(t -> t.getId().equals(id));
    }
}
