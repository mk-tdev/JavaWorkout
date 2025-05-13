package com.mk.mutableandimmutable;

import java.util.*;

public class MainMailer {
    public static void main(String[] args) {
        String[] names = {
                "John Doe",
                "John Doe M.D.",
                "John Smith",
                "John Wick",
                "John Wick M.D.",
                "John Wick Ph.D.",
        };
        List<StringBuilder> population = getNames(names);
        Map<StringBuilder, Integer> populationCount = new TreeMap<>();
        population.forEach(s -> {
            populationCount.merge(s, 1, Integer::sum);
        });
        System.out.println(populationCount);
        // Incomplete

    }

    public static List<StringBuilder> getNames(String[] names) {
        List<StringBuilder> namesList = new ArrayList<>();
        int index = 3;
        for (String name : names) {
            for (int i = 0; i < index; i++) {
                namesList.add(new StringBuilder(name));
            }
            index++;
        }

        return namesList;
    }
}
