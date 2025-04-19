package org.java.FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<String> printConsumer = str->System.out.println(str);
        printConsumer.accept("Kuldeep");

        IntConsumer intConsumer = value -> System.out.println(value);
        intConsumer.accept(23);

        LongConsumer longConsumer = value -> System.out.println(value);
        longConsumer.accept(34);

        LongConsumer timeStamp = value -> System.out.println(value);
        timeStamp.accept(System.currentTimeMillis());
    }
}
