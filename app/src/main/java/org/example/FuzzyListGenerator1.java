
public class FuzzyListGenerator1 {
    public static void main(String[] args) {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        System.out.println("Linear Search on Sorted: Index = " + finder.linearSearch(sortedFuzzies));
        System.out.println("Binary Search on Sorted: Index = " + finder.binarySearch(sortedFuzzies));
        System.out.println("Linear Search on Random: Index = " + finder.linearSearch(randomFuzzies));
        System.out.println("Binary Search on Random: Index = " + finder.binarySearch(randomFuzzies));
    }
}
