package org.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class max {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,6,8,3,2);

        int max = list.stream().max(Integer::compareTo).get();

        System.out.println(max);
    }
}
