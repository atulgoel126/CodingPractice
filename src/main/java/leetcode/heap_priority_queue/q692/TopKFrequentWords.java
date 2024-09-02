package leetcode.heap_priority_queue.q692;

import java.util.*;

public class TopKFrequentWords {
    public String[] topKFrequent(String[] words, int k) {

        if (k > words.length) {
            throw new IllegalArgumentException("Unable to get topK elements with less than k elements.");
        }

        if (k <= 0) {
            throw new IllegalArgumentException("k  value cannot be negative for top k elements");
        }

        Map<String, Integer> freqMap = count(words);

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (word1, word2) -> {
                    if (word1.getValue() == word2.getValue()) {
                        return word1.getKey().compareTo(word2.getKey());
                    }
                    return word2.getValue() - word1.getValue();
                }
        );

        pq.addAll(freqMap.entrySet());

        String[] topK = new String[k];
        for (int i = 0; i < k; i++) {
            topK[i] = pq.poll().getKey();
        }
        return topK;
    }

    private Map<String, Integer> count(String[] words) {
        Map<String, Integer> count = new HashMap<>();

        for (String w: words) {
            count.put(w, count.getOrDefault(w,0) + 1);
        }
        return count;
    }}
