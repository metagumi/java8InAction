package com.slyone.java8.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TestMappingDevidedByThree {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i ->
                                numbers2.stream()
                                        .filter(j -> (i+j) % 3 == 0)
                                        .map(j -> new int[]{i, j})
                                        )
                        .collect(toList());

        //System.out.println(pairs);
        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
    }

}
