package org.java.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedStringzExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Kuldeep","Rahul","Akshay","Prabhav");

        List<String> result = list.stream().sorted().toList(); //natural order alphabetical

        System.out.println(result);

        List<String> resultq = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(resultq);

     }
}
