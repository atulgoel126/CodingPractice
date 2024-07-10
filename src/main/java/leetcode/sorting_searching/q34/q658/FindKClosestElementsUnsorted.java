package leetcode.sorting_searching.q34.q658;

import java.util.*;

public class FindKClosestElementsUnsorted {
    public List<Integer>findClosestElements(int[] arr, int k, int x) {

        // Create a max-heap (priority queue) to keep the closest k elements
        PriorityQueue<Entry> maxHeap = new PriorityQueue<>(new Comparator<Entry>() {
            @Override
            public int compare(Entry a, Entry b) {
                if (a.delta == b.delta) {
                    return b.value - a.value; // Order by value if deltas are equal (reverse order for max heap)
                } else {
                    return b.delta - a.delta; // Order by delta (reverse order for max heap)
                }
            }
        });

        for (int value : arr) {
            int delta = Math.abs(value - x);
            maxHeap.offer(new Entry(value, delta));
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the element with the highest delta
            }
        }

        List<Integer> result = new ArrayList<>(k);
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll().value);
        }

        // Sort the result before returning
        Collections.sort(result);
        return result;
    }

    private static class Entry {
        int value;
        int delta;

        Entry(int value, int delta) {
            this.value = value;
            this.delta = delta;
        }
    }
}
