package org.java.streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9);

        List<Integer> res = list.stream().filter(e->e%2==0).toList();

        res.forEach(System.out::println);
    }
}
