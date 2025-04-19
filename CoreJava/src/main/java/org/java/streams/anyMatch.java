package org.java.streams;

import java.util.Arrays;
import java.util.List;

class Employee2 {
    private int id;
    private String name;
    private double salary;

    public Employee2(int id, String name, double salary) {
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
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

// Check if any employee's salary is greater than 50,000
public class anyMatch {

    public static void main(String[] args) {

        List<Employee2> employees = Arrays.asList(
                new Employee2(1, "Ramesh", 55000),
                new Employee2(2, "Umesh", 45000),
                new Employee2(3, "Sanjay", 50000),
                new Employee2(4, "John", 30000)
        );

        boolean result = employees.stream()
                .anyMatch((employee) -> employee.getSalary() > 50000);

        System.out.println(result);

    }
}
