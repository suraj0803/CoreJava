package org.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Skip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,45,67,45,12);

        List<Integer> res = list.stream().skip(3)
                        .limit(67)
                        .toList();
        System.out.println(res);

    }
}
