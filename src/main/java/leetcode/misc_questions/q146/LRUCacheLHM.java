package leetcode.misc_questions.q146;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheLHM extends LinkedHashMap<Integer, Integer> {
    private final int capacity;

    public LRUCacheLHM(int capacity) {
        super(capacity, 1.0f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }
}
