package org.java.FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        // Traditional way
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String result = function.apply("Ramesh");
        System.out.println(result);

        //Lambda Expression
        Function<String,String> toUpperCase = message->message.toUpperCase();
        System.out.println(toUpperCase.apply("kullu"));

        Function<String,String> reverseString = str->new StringBuilder(str).reverse().toString();
        System.out.println(reverseString.apply("kullu"));

        Function<String,String> str = s->new StringBuilder(s).substring(0,3).toString();
        System.out.println(str.apply("Yesdone"));
    }

}
