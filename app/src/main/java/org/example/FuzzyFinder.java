public class FuzzyFinder {

    public int linearSearch(List<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if ("gold".equals(fuzzies.get(i).color)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(List<Fuzzy> fuzzies) {
        int low = 0;
        int high = fuzzies.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midColor = fuzzies.get(mid).color;

            int comparison = midColor.compareTo("gold");

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
