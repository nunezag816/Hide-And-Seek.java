package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FuzzyListGenerator1 {

    private int iterations;
    private final String[] colors = { "red", "orange", "yellow", "green", "blue", "indigo", "violet" };
    private final Random rand = new Random();

    public FuzzyListGenerator() {
        this.iterations = 7000;
    }

    public FuzzyListGenerator(int iterations) {
        this.iterations = iterations;
    }

    public ArrayList<Feeling> sortedRainbowFuzzies() {
        ArrayList<Feeling> list = new ArrayList<>();

        for (int i = 0; i < iterations; i++) {
            String color = colors[i % colors.length];
            list.add(new Fuzzy(color));
        }

        list.add(new Fuzzy("gold"));

        list.add(new Prickly());

        return list;
    }

    public ArrayList<Feeling> randomizedRainbowFuzzies() {
        ArrayList<Feeling> list = new ArrayList<>();

        for (int i = 0; i < iterations; i++) {
            String color = colors[i % colors.length];
            list.add(new Fuzzy(color));
        }

        list.add(new Fuzzy("gold"));
        list.add(new Prickly());

        Collections.shuffle(list, rand);

        return list;
    }
}
