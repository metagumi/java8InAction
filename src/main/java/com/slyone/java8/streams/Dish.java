package com.slyone.java8.streams;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public final String getName() {
        return name;
    }

    public final boolean isVegetarian() {
        return vegetarian;
    }

    public final int getCalories() {
        return calories;
    }

    public final Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public enum Type { MEAT, FISH, OTHER}
}
