package com.coen92.projects.web.springbootfirstproject.implement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //makes a class readable as a resource for building relational database
public class Topic {

    @Id //specifies variable below as PRIMARY KEY
    private String id;

    private String name;
    private String description;

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
