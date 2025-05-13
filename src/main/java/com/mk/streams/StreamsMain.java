package com.mk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 1, 3);
        Stream<String> stringStream = Stream.of( "banana", "pear", "orange", "pine", "apple", "banana", "pear", "orange");

        System.out.println(
                Stream.of(
                        "Laptop", "Phone", "Tablet"
                ).collect(Collectors.groupingBy(e -> e.length()))
        );

        System.out.println(
                Stream.of(
                        "Laptop", "Phone", "Tablet", "Mouse"
                ).collect(Collectors.partitioningBy(e -> e.length() > 5))
        );


        System.out.println(
                stringStream.collect(Collectors.groupingBy(String::length, Collectors.counting()))
        );

//        stringStream
////                .filter(s -> s.startsWith("p"))
//                .map(String::toUpperCase)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

    }
}
