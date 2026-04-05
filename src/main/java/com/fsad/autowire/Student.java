package com.fsad.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("101")
    private int id;

    @Value("AdithyaCharan")
    private String name;

    @Value("Male")
    private String gender;

    // @Autowired — Field Injection
    @Autowired
    private Certification certification;

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public Certification getCertification() { return certification; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name
                + ", gender=" + gender
                + ", certification=" + certification + "]";
    }
}
