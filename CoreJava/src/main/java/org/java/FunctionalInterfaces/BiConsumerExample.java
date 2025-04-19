package org.java.FunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String,String> fullName = (firstName,lastName)-> System.out.println("firstname : " + firstName + " " +  "lastname : "+ lastName);
        fullName.accept("kuldeep","dwivedi");

    }
}
