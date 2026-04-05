package com.fsad.autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.fsad.autowire")
public class AppConfig {
    // No explicit bean definitions needed.
    // @Component on Student and Certification handles registration.
}
