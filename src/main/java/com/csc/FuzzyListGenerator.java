package com.csc;

// Don't change this file!

import java.util.ArrayList;
import java.util.Collections;

public class FuzzyListGenerator {
  public ArrayList<Fuzzy> randomized_rainbow_fuzzies() {
    ArrayList<Fuzzy> fuzzies = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      fuzzies.add(new Fuzzy("red"));
      fuzzies.add(new Fuzzy("orange"));
      fuzzies.add(new Fuzzy("yellow"));
      fuzzies.add(new Fuzzy("green"));
      fuzzies.add(new Fuzzy("blue"));
      fuzzies.add(new Fuzzy("indigo"));
      fuzzies.add(new Fuzzy("violet"));
    }
    fuzzies.add(new Fuzzy("gold"));

    Collections.shuffle(fuzzies);
    return fuzzies;
  };
}
