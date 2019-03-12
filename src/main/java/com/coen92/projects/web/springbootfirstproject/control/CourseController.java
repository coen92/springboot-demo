package com.coen92.projects.web.springbootfirstproject.control;

import com.coen92.projects.web.springbootfirstproject.implement.Course;
import com.coen92.projects.web.springbootfirstproject.implement.Topic;
import com.coen92.projects.web.springbootfirstproject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable("id") String id) {

        return courseService.getAllCourses(id);
    }

    @RequestMapping(value = "/topics/{id{/courses/{courseId}") //RETRIEVE
    public Course getCourse(@PathVariable("courseId") String courseId) {

        return courseService.getCourse(courseId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{id}/courses") // CREATE
    public void addCourse(@RequestBody Course course, @PathVariable("id") String id) {
        course.setTopic(new Topic(id, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}/courses/{courseId}") // UPDATE
    public void updateCourse(@RequestBody Course course, @PathVariable("courseId") String courseId, @PathVariable("id") String id) {
        course.setTopic(new Topic(id, "", ""));
        courseService.updateCourse(course, courseId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}/courses/{courseId}") // DELETE
    public void deleteCourse(@PathVariable("courseId") String courseId) {

        courseService.deleteCourse(courseId);
    }
}
