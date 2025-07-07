import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class FuzzyFinderTest {

    @Test
    void testLinearSearchSorted() {
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = new FuzzyListGenerator().sortedRainbowFuzzies();
        assertNotEquals(-1, finder.linearSearch(list));
    }

    @Test
    void testBinarySearchSorted() {
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = new FuzzyListGenerator().sortedRainbowFuzzies();
        assertNotEquals(-1, finder.binarySearch(list));
    }

    @Test
    void testLinearSearchRandom() {
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = new FuzzyListGenerator().randomizedRainbowFuzzies();
        assertNotEquals(-1, finder.linearSearch(list));
    }

    @Test
    void testBinarySearchRandom() {
        FuzzyFinder finder = new FuzzyFinder();
        ArrayList<Fuzzy> list = new FuzzyListGenerator().randomizedRainbowFuzzies();
        assertEquals(-1, finder.binarySearch(list));
    }
}
