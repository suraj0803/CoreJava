package org.java.streams;

import java.util.Arrays;
import java.util.List;

class Employee1 {
    private int id;
    private String name;
    private double salary;

    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class allMatch {

    public static void main(String[] args) {

        List<Employee1> employees = Arrays.asList(
                new Employee1(1, "Ramesh", 55000),
                new Employee1(2, "Umesh", 45000),
                new Employee1(3, "Sanjay", 50000),
                new Employee1(4, "John", 30000)
        );

        boolean result = employees.stream()
                .allMatch(employee -> employee.getSalary() > 25000);

        System.out.println(result);

    }
}
