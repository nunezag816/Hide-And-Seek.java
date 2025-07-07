import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Feeling> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Feeling> randomFuzzies = generator.randomizedRainbowFuzzies();

        System.out.println("Linear Search (Gold) on Sorted: Index = " + finder.linearSearchGold(sortedFuzzies));
        System.out.println("Binary Search (Gold) on Sorted: Index = " + finder.binarySearchGold(sortedFuzzies));
        System.out.println("Linear Search (Gold) on Random: Index = " + finder.linearSearchGold(randomFuzzies));
        System.out.println("Binary Search (Gold) on Random: Index = " + finder.binarySearchGold(randomFuzzies));

        System.out.println("Linear Search (Prickly) on Sorted: Index = " + finder.linearSearchPrickly(sortedFuzzies));
        System.out.println("Linear Search (Prickly) on Random: Index = " + finder.linearSearchPrickly(randomFuzzies));
    }
}
