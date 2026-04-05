package com.fsad.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        // Load Spring IoC container via XML
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve Student bean — Certification is auto-injected
        Student student = context.getBean(Student.class);

        System.out.println("--- Student Details ---");
        System.out.println(student);
        System.out.println("Certification: " + student.getCertification());
    }
}
