package org.java.streams;

import java.util.Arrays;
import java.util.List;

public class nonmatch {

    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(new Employee("1", "kuldeep", "dwivedi"),
                new Employee("2", "rahul", "sharma"),
                new Employee("3", "prabhav", "Singh"));

        boolean result = employee.stream().noneMatch(employe -> employe.getFirstname().equals("kuld"));

        System.out.println(result);
    }

}

class Employee{

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public Employee(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    private String id;
    private String firstname;
    private String lastname;


}