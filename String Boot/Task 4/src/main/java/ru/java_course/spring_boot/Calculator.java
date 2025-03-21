package ru.java_course.spring_boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public double calculation(double a, double b, AnnotationConfigApplicationContext context, String operationId) {
        return context.getBean(operationId, Operation.class).getResult(a, b);
    }
}
