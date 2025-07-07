package org.example;

import java.util.List;

public class FuzzyFinder {

    public int linearSearchGold(List<Feeling> list) {
        for (int i = 0; i < list.size(); i++) {
            if ("gold".equals(list.get(i).description())) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearchGold(List<Feeling> list) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midDesc = list.get(mid).description();
            int cmp = midDesc.compareTo("gold");

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int linearSearchPrickly(List<Feeling> list) {
        for (int i = 0; i < list.size(); i++) {
            if ("Pokey!".equals(list.get(i).description())) {
                return i;
            }
        }
        return -1;
    }
}
