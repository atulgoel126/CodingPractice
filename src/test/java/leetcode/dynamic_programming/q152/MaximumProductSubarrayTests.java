package leetcode.dynamic_programming.q152;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayTests {
    private MaximumProductSubarray ob = new MaximumProductSubarray();

    @Test
    public void testBasicPositive() {
        int[] nums = {2, 3, -2, 4};
        assertEquals(6, ob.maxProduct(nums));
    }

    @Test
    public void testAllNegative() {
        int[] nums = {-2, -3, -4};
        assertEquals(12, ob.maxProduct(nums));
    }

    @Test
    public void testMixedWithZero() {
        int[] nums = {-2, 0, -1};
        assertEquals(0, ob.maxProduct(nums));
    }

    @Test
    public void testSingleNumber() {
        int[] nums = {4};
        assertEquals(4, ob.maxProduct(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, ob.maxProduct(nums));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {1000, 1000, -2000, 1000};
        assertEquals(1000000, ob.maxProduct(nums));
    }

    @Test
    public void testAlternatingSignsWithZero() {
        int[] nums = {-2, 3, -4, 5, -6, 0, 7, -8};
        assertEquals(360, ob.maxProduct(nums));
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        assertEquals(0, ob.maxProduct(nums));
    }

    @Test
    public void testLargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i % 2 == 0) ? 2 : 3;
        }
        assertEquals(0, ob.maxProduct(nums));
    }

    @Test
    public void testWithOneNegativeNumber() {
        int[] nums = {2, 3, -2, 4, 5};
        assertEquals(20, ob.maxProduct(nums));
    }

    @Test
    public void testOverflow() {
        int[] nums = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        assertEquals(1000000000, ob.maxProduct(nums));  // Result would be larger than Integer.MAX_VALUE
    }
}