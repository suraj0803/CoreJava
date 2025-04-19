package org.java.streams;

import java.util.Arrays;
import java.util.List;

public class Count {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Orange", "Cherry");

        Long count = fruits.stream().count();

        System.out.println(count);
    }
}
