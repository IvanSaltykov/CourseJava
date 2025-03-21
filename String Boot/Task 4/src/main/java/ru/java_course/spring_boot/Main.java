package ru.java_course.spring_boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = context.getBean("calculator", Calculator.class);
        System.out.print("Введите число а: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введ1ите тип операции: [adder, divider, multiplier, subtractor]: ");
        String operation = scanner.next();
        System.out.println(calculator.calculation(a, b, context, operation));
        context.close();
    }
}
