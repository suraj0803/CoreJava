package org.java.streams;

import java.util.Arrays;
import java.util.List;

public class Limit {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Banana","Apple","Mango","Papaya");

        List<String> res = fruits.stream().limit(3).toList();

        res.forEach(e->System.out.println(e));

        System.out.println("--------------");

        res.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> list = numbers.stream()
                                    .filter(n->n%2==0)
                                    .limit(6).toList();
        list.forEach(System.out::println);
    }
}
