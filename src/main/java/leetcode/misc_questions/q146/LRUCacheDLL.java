package leetcode.misc_questions.q146;

import leetcode.commons.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LRUCacheDLL extends LinkedHashMap<Integer, Integer> {
    private final int capacity;
    private final HashMap<Integer, Node> cache;
    private final DoubleLinkedList list;

    public LRUCacheDLL(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
        this.list = new DoubleLinkedList();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key);
        list.moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            list.moveToHead(node);
        } else {
            if (cache.size() >= capacity) {
                Node tail = list.removeTail();
                cache.remove(tail.key);
            }
            Node newNode = new Node(key, value);
            list.addToHead(newNode);
            cache.put(key, newNode);
        }
    }
}
