package com.fsad.autowire;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id;
    private String name;
    private String dateOfCompletion;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDateOfCompletion() { return dateOfCompletion; }
    public void setDateOfCompletion(String d) { this.dateOfCompletion = d; }

    @Override
    public String toString() {
        return "Certification [id=" + id + ", name=" + name
                + ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}
