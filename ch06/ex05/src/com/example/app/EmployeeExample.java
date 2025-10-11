package com.example.app;
import java.util.*;
import java.util.stream.*;

public class EmployeeExample {
    record Employee(String name, int salary) {}

    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("Kim", 5000),
                new Employee("Lee", 4000),
                new Employee("Park", 6000)
        );

        list.stream()
                .filter(e -> e.salary() >= 5000)
                .map(Employee::name)
                .sorted()
                .forEach(System.out::println);
    }
}