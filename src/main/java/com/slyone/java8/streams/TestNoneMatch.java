package com.slyone.java8.streams;

import java.util.Arrays;
import java.util.List;

public class TestNoneMatch {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList (
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 800, Dish.Type.FISH),
                new Dish("salmon", false, 800, Dish.Type.FISH));

        boolean isHealthy = menu.stream()
                .noneMatch((d -> d.getCalories() >= 1000));
        System.out.println(isHealthy);

        System.out.println(System.getProperty("java.home"));
    }
}