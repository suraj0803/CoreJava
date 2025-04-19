package org.java.FunctionalInterfaces.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {


        BiFunction<Integer, Integer, Integer> addition = (num1, num2) -> num1 + num2;
        int result = addition.apply(2, 3);

        System.out.println(result);

        BiFunction<Integer, Integer, Integer> multiplication = (num1, num2) -> num1 * num2;

        int result1 = multiplication.apply(3, 4);

        System.out.println(result1);

    }
}
