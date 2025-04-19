package org.java.streams;

import java.util.Arrays;
import java.util.List;

public class Distinct {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple","Apple","Mango","Papaya","grapes","grapes");

        List<String> res = fruits.stream().distinct().toList();

        res.forEach(System.out::println);
    }
}
