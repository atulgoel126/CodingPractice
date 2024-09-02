package leetcode.heap_priority_queue.q215;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KthLargestElementInArrayTests {
    @Test
    public void testExample1() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        assertEquals(5, ob.findKthLargest(nums, k));
    }

    @Test
    public void testExample2() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        assertEquals(4, ob.findKthLargest(nums, k));
    }

    @Test
    public void testSingleElement() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {1};
        int k = 1;
        assertEquals(1, ob.findKthLargest(nums, k));
    }

    @Test
    public void testAllElementsSame() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {2, 2, 2, 2, 2};
        int k = 3;
        assertEquals(2, ob.findKthLargest(nums, k));
    }

    @Test
    public void testNegativeNumbers() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {-1, -2, -3, -4, -5};
        int k = 2;
        assertEquals(-2, ob.findKthLargest(nums, k));
    }

    @Test
    public void testMixedNumbers() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {3, -1, 2, 0, 5, -2};
        int k = 3;
        assertEquals(2, ob.findKthLargest(nums, k));
    }

    @Test
    public void testLargeK() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {10, 4, 3, 2, 1, 15, 6, 9, 8};
        int k = 1;
        assertEquals(15, ob.findKthLargest(nums, k));
    }

    @Test
    public void testMinimumK() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {10, 4, 3, 2, 1, 15, 6, 9, 8};
        int k = 9;
        assertEquals(1, ob.findKthLargest(nums, k));
    }

    @Test
    public void testArrayWithZeroes() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {0, 0, 0, 0, 0, 0};
        int k = 4;
        assertEquals(0, ob.findKthLargest(nums, k));
    }

    @Test
    public void testEmptyArray() {
        KthLargestElementInArray ob = new KthLargestElementInArray();
        int[] nums = {};
        int k = 1;
        assertThrows(IllegalArgumentException.class, () -> {
            ob.findKthLargest(nums, k);
        });
    }
}
