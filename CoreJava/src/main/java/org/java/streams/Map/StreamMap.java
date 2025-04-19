package org.java.streams.Map;

import java.util.Arrays;
import java.util.List;

public class StreamMap {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango"); // source

        List<String> list = fruits.stream().peek(e->System.out.println("Before map() method ->" + e))
                .map(e->e.toUpperCase())
                .peek(e->System.out.println("After map() method ->" + e))
                .toList();

    }
}
