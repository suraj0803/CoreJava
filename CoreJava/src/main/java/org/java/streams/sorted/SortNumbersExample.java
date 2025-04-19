package org.java.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbersExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23,56,55,21,87);

        List<Integer> newList = list.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(newList);
        // natural sorted
        List<Integer> naturalsortedList = list.stream().sorted().toList();
        System.out.println(naturalsortedList);

    }
}
