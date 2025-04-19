package org.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class flatMap {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        Stream<List<Integer>> stream = list.stream();
        // mapping as well as flattening

        List<Integer> res = stream.flatMap(l->l.stream()).toList();
        res.forEach(System.out::println);


        // Collecting Nested Arrays into a Single List
        String[][] dataArray = new String[][]{{"a", "b"},
                {"c", "d"}, {"e", "f"}, {"g", "h"}};

        Stream<String[]> stringStream = Arrays.stream(dataArray);
        List<String> result1 = stringStream.flatMap(s->Arrays.stream(s)).toList();
        result1.forEach(System.out::println);

    }
}
