package com.slyone.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestFindFirstElement {
    public static void main(String[] args) {
        List<Integer> someNumbers = Arrays.asList(1,2,3,4,5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                    .map(x -> x * x)
                    .filter(x -> x % 3 == 0)
                    .findFirst(); //9

        System.out.println(firstSquareDivisibleByThree);
    }
}
