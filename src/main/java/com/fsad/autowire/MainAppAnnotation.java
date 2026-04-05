package com.fsad.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppAnnotation {
    public static void main(String[] args) {

        // Load Spring IoC container via Annotation config
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        System.out.println("--- Student Details (Annotation Config) ---");
        System.out.println(student);
    }
}
