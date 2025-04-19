package org.java.FunctionalInterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<String> constValues =  ()-> ("Hello Kullu");
        String res = constValues.get();
        System.out.println(res);

        Supplier<LocalDateTime> dateTimeSupplier = () -> LocalDateTime.now();
        LocalDateTime dateTime = dateTimeSupplier.get();
        System.out.println(dateTime);
    }
}
