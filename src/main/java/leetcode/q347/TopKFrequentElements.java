package leetcode.q347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = calculateFrequency(nums);
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a,b) -> b.getValue() - a.getValue()
        );

        maxHeap.addAll(freq.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }

        return result;
    }

    private Map<Integer, Integer> calculateFrequency(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n: nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        return freq;
    }
}
