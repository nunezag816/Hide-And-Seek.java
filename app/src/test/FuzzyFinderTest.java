package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FuzzyFinderTest {

    private FuzzyListGenerator generator;
    private FuzzyFinder finder;
    private ArrayList<Feeling> sortedList;
    private ArrayList<Feeling> randomList;

    @BeforeEach
    public void setup() {
        generator = new FuzzyListGenerator();
        finder = new FuzzyFinder();

        sortedList = generator.sortedRainbowFuzzies();
        randomList = generator.randomizedRainbowFuzzies();
    }

    @Test
    public void testLinearSearchGoldSorted() {
        int index = finder.linearSearchGold(sortedList);
        assertTrue(index >= 0, "Golden fuzzy should be found in sorted list");
        assertEquals("gold", sortedList.get(index).description());
    }

    @Test
    public void testBinarySearchGoldSorted() {
        int index = finder.binarySearchGold(sortedList);
        assertTrue(index >= 0, "Golden fuzzy should be found with binary search in sorted list");
        assertEquals("gold", sortedList.get(index).description());
    }

    @Test
    public void testLinearSearchGoldRandom() {
        int index = finder.linearSearchGold(randomList);
        assertTrue(index >= 0, "Golden fuzzy should be found in random list by linear search");
        assertEquals("gold", randomList.get(index).description());
    }

    @Test
    public void testBinarySearchGoldRandom() {
        int index = finder.binarySearchGold(randomList);
        assertEquals(-1, index, "Binary search should fail or return -1 on randomized list");
    }

    @Test
    public void testLinearSearchPricklySorted() {
        int index = finder.linearSearchPrickly(sortedList);
        assertTrue(index >= 0, "Cold prickly should be found in sorted list");
        assertEquals("Pokey!", sortedList.get(index).description());
    }

    @Test
    public void testLinearSearchPricklyRandom() {
        int index = finder.linearSearchPrickly(randomList);
        assertTrue(index >= 0, "Cold prickly should be found in random list");
        assertEquals("Pokey!", randomList.get(index).description());
    }
}
