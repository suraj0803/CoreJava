package org.java.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        // Create a Stream from List
        List<String> fruits = Arrays.asList("Mango","Banana","Apple","Orange");
        Stream<String> stream = fruits.stream();

        stream.forEach(System.out::println);

        System.out.println("------------------");
        // Create a Stream from Set

        Set<String> fruitSet = new HashSet<>(fruits);
        Stream<String>  fruit = fruitSet.stream();

        fruit.forEach(System.out::println);

        System.out.println("------------------");
        // Create a Stream from Map
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",10);
        map.put("Banana",12);
        map.put("Mango",30);

        // Create a Stream from Map's entrySet
        Stream<Map.Entry<String,Integer>> entryStream = map.entrySet().stream();
        entryStream.forEach(System.out::println);
        System.out.println("------------------");

        // Create a Stream from Map's keySet
        Stream<String> entryStream1 = map.keySet().stream();
        entryStream1.forEach(System.out::println);

        System.out.println("------------------");
        // Create a Stream from Map's values
        Stream<Integer> integerStream = map.values().stream();
        integerStream.forEach(System.out::println);

        System.out.println("------------------");
        // Create a Stream from an Array
        String[] strArray = {"Banana","Apple","Mango"};
        Stream<String> stringStream = Arrays.stream(strArray);
        stringStream.forEach(System.out::println);

        System.out.println("------------------");
        // Create a Stream using Stream.of() method
        Stream<String> streamStream = Stream.of("Apple","Banana","Mango");
        streamStream.forEach(System.out::println);

    }
}
