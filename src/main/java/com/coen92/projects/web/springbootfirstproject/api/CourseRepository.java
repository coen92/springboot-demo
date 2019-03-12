package com.coen92.projects.web.springbootfirstproject.api;

import com.coen92.projects.web.springbootfirstproject.implement.Course;
import com.coen92.projects.web.springbootfirstproject.implement.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByName(String name);
    public List<Course> findByDescription(String description);

    public List<Course> findByTopicId(String id);
}
