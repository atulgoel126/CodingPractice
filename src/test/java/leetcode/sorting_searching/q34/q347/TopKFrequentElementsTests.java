package leetcode.sorting_searching.q34.q347;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.sorting_searching.q34.q347.TopKFrequentElements;

public class TopKFrequentElementsTests {

    @Test
    public void testExample1() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};
        assertArrayEquals(expected, ob.topKFrequent(nums, k));
    }

    @Test
    public void testExample2() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        assertArrayEquals(expected, ob.topKFrequent(nums, k));
    }

    @Test
    public void testAllSameElements() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 1};
        int k = 1;
        int[] expected = {1};
        assertArrayEquals(expected, ob.topKFrequent(nums, k));
    }

    @Test
    public void testKEqualsLength() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        int[] expected = {1, 2, 3, 4, 5}; // Any order is fine
        int[] result = ob.topKFrequent(nums, k);
        assertTrue(result.length == 5);
        assertTrue(containsAll(result, expected));
    }

    @Test
    public void testNegativeAndPositiveNumbers() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {-1, -1, -1, 2, 2, 3, 3, 3, 3};
        int k = 2;
        int[] expected = {3, -1};
        assertArrayEquals(expected, ob.topKFrequent(nums, k));
    }

    @Test
    public void testPerformance() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 100; // Creating repeated patterns
        }
        int k = 10;

        long startTime = System.currentTimeMillis();
        int[] result = ob.topKFrequent(nums, k);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        assertTrue(duration < 1000, "Test took too long to complete.");
        assertTrue(result.length == k);
    }

    @Test
    public void testKEquals1() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1, 2, 3, 3, 2, 2};
        int k = 1;
        int[] expected = {2};
        assertArrayEquals(expected, ob.topKFrequent(nums, k));
    }

    // Helper method to check if the result contains all elements in the expected array
    private boolean containsAll(int[] result, int[] expected) {
        for (int num : expected) {
            boolean found = false;
            for (int res : result) {
                if (num == res) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }
}
