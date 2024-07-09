package leetcode.misc_questions.q146;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTests {

    @Test
    public void testBasicOperationsDLL() {
        LRUCacheDLL cache = new LRUCacheDLL(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));    // returns 1
        cache.put(3, 3); // evicts key 2
        assertEquals(-1, cache.get(2));   // returns -1 (not found)
        cache.put(4, 4); // evicts key 1
        assertEquals(-1, cache.get(1));   // returns -1 (not found)
        assertEquals(3, cache.get(3));    // returns 3
        assertEquals(4, cache.get(4));    // returns 4
    }

    @Test
    public void testBasicOperationsLHM() {
        LRUCacheLHM cache = new LRUCacheLHM(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));    // returns 1
        cache.put(3, 3); // evicts key 2
        assertEquals(-1, cache.get(2));   // returns -1 (not found)
        cache.put(4, 4); // evicts key 1
        assertEquals(-1, cache.get(1));   // returns -1 (not found)
        assertEquals(3, cache.get(3));    // returns 3
        assertEquals(4, cache.get(4));    // returns 4
    }

    @Test
    public void testEvictionOrderDLL() {
        LRUCacheDLL cache = new LRUCacheDLL(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4); // evicts key 1
        assertEquals(-1, cache.get(1));   // returns -1 (not found)
        assertEquals(2, cache.get(2));    // returns 2
        assertEquals(3, cache.get(3));    // returns 3
        assertEquals(4, cache.get(4));    // returns 4
    }

    @Test
    public void testEvictionOrderLHM() {
        LRUCacheLHM cache = new LRUCacheLHM(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4); // evicts key 1
        assertEquals(-1, cache.get(1));   // returns -1 (not found)
        assertEquals(2, cache.get(2));    // returns 2
        assertEquals(3, cache.get(3));    // returns 3
        assertEquals(4, cache.get(4));    // returns 4
    }

    @Test
    public void benchmarkPerformanceDLL() {
        LRUCacheDLL cache = new LRUCacheDLL(10000);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {
            cache.put(i, i);
            if (i % 2 == 0) {
                cache.get(i / 2);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("LRUCacheDLL: " + (endTime - startTime) + " ms");
    }

    @Test
    public void benchmarkPerformanceLHM() {
        LRUCacheLHM cache = new LRUCacheLHM(10000);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {
            cache.put(i, i);
            if (i % 2 == 0) {
                cache.get(i / 2);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("LRUCacheLHM: " + (endTime - startTime) + " ms");
    }
}
