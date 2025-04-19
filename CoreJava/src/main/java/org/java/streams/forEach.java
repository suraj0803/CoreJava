package org.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class forEach {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple","banana","grapes","orange");

        fruits.forEach(f->System.out.println(fruits));

        List<Integer> num = Arrays.asList(1,6,5,3);

        num.stream().sorted(Comparator.reverseOrder()).forEach(f->System.out.println(num));
    }
}
