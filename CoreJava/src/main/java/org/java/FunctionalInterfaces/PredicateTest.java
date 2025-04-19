package org.java.FunctionalInterfaces;

import java.util.function.DoublePredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {


        Predicate<Integer> isEven = num->num%2==0;
        System.out.println(isEven.test(4));

        // Autoboxing occurs when passing a primitive int
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(15)); // false

        // LongPredicate to check if a number is positive
        LongPredicate isPositive = num -> num > 0;

        // Test the LongPredicate
        System.out.println(isPositive.test(100L)); // true
        System.out.println(isPositive.test(-100L));

        // DoublePredicate to check if a number is greater than 10
        DoublePredicate isGreaterThanTen = num -> num > 10.0;

        System.out.println(isGreaterThanTen.test(15.5)); // true
        System.out.println(isGreaterThanTen.test(9.5));
    }
}
