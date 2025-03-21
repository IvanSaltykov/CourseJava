package ru.java_course.spring_boot;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Subtractor implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}
