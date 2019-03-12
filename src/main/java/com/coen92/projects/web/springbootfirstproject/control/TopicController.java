package com.coen92.projects.web.springbootfirstproject.control;

import com.coen92.projects.web.springbootfirstproject.implement.Topic;
import com.coen92.projects.web.springbootfirstproject.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topics")
    public List<Topic> getAllTopics() {

        return topicService.getAllTopics();
    }

    @RequestMapping(value = "/topics/{id}")  //RETRIEVE
    public Topic getTopic(@PathVariable("id") String id) {

        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics") // CREATE
    public void addTopic(@RequestBody Topic topic) {

        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}") // UPDATE
    public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id) {

        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}") // DELETE
    public void deleteTopic(@PathVariable("id") String id) {

        topicService.deleteTopic(id);
    }
}
