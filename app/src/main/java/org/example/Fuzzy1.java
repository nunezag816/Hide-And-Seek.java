package org.example;

public class Fuzzy1 implements Feeling {
    public String color;

    public Fuzzy(String color) {
        this.color = color;
    }

    @Override
    public String description() {
        return color;
    }
}
