package org.java.streams;

import java.util.Arrays;
import java.util.List;

public class min {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(34,7,65,12,90);

        int min = list.stream().min(Integer::compareTo).get();
        System.out.println(min);
    }
}
