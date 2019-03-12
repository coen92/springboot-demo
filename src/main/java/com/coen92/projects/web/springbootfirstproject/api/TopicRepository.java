package com.coen92.projects.web.springbootfirstproject.api;

import com.coen92.projects.web.springbootfirstproject.implement.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {


}
