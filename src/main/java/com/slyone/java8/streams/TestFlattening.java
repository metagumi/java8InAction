package com.slyone.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TestFlattening {
    public static void main(String[] args) {
        List<String> words = Arrays.asList ("Hello, World");
        words.stream()
                .map(word -> word.split(""))
                .distinct()
                .collect(toList());
        System.out.println(words);

        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
        words.stream()
               .map(word -> word.split(""))
               .map(Arrays::stream)
               .distinct()
               .collect(toList());

        System.out.println(words);

        List<String> uniqueCharacters =
                words.stream()
                    .map(w -> w.split(""))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .collect(Collectors.toList());

        System.out.println(uniqueCharacters);
    }
}
