package org.java.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortUser {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SortUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public SortUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
}

class sort{

    public static void main(String[] args) {

        List<SortUser> user  = Arrays.asList(new SortUser("Kuldeep",25),
                new SortUser("Prabhav",23),
                new SortUser("Akshay",27));

        /*Comparator userComparator = new Comparator<SortUser>() {
            @Override
            public int compare(SortUser o1, SortUser o2) {
                return o1.getAge()-o2.getAge();
            }
        };*/

        //Sort the user by age in ascending order
        List<SortUser> result = user.stream().sorted(Comparator.comparingInt(SortUser::getAge)).toList();
        System.out.println(result);

        List<SortUser> res = user.stream().sorted(Comparator.comparingInt(SortUser::getAge).reversed()).toList();
        System.out.println(res);

        //Sort the user by name in ascending order
        List<SortUser> name = user.stream().sorted(Comparator.comparing(SortUser::getName).reversed()).toList();
        System.out.println(name);

        List<SortUser> name1 = user.stream().sorted(Comparator.comparing(SortUser::getName)).toList();
        System.out.println(name1);


    }
}