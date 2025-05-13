package com.mk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Jane",
                true
        );

        System.out.println(user);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        numbers.forEach(System.out::println);
        // Java Streams make data processing super easy!

        // Filtering: Get even numbers:
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 ==0)
                .toList();
        System.out.println("evens: " + evens);

        // Mapping: strings to uppercase:
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("upper: " + upper);

        // Reducing: Sum all numbers:
        List<Integer> nums =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum: " + sum);

        // Chaining: Combine operations:

        List<String> result = names.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .sorted().toList();

        System.out.println("result: " + result);
    }
}
