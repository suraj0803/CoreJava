package org.java.streams.Map;

import java.util.Arrays;
import java.util.List;

public class StreamMapEX {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1","4","7","4");

        System.out.println(list);

        List<Integer> integerList = list.stream().map(e->Integer.valueOf(e)).toList();

        System.out.println(integerList);
    }
}
