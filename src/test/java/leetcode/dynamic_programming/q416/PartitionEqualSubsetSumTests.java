package leetcode.dynamic_programming.q416;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartitionEqualSubsetSumTests {
    private PartitionEqualSubsetSum ob = new PartitionEqualSubsetSum();

    @Test
    public void testEqualSubsetSum() {
        int[] nums = {1, 5, 11, 5};
        assertTrue(ob.canPartition(nums));
    }

    @Test
    public void testUnequalSubsetSum() {
        int[] nums = {1, 5, 11, 6};
        assertFalse(ob.canPartition(nums));
    }

    @Test
    public void testSingleNumber() {
        int[] nums = {4};
        assertFalse(ob.canPartition(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertTrue(ob.canPartition(nums));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {100, 200, 150, 50, 250, 350};
        assertTrue(ob.canPartition(nums));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, 5, -11, 6};
        assertFalse(ob.canPartition(nums));
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        assertTrue(ob.canPartition(nums));
    }

    @Test
    public void testLargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 2;
        }
        assertTrue(ob.canPartition(nums));
    }

    @Test
    public void testDuplicateNumbers() {
        int[] nums = {1, 2, 3, 3};
        assertFalse(ob.canPartition(nums));
    }
}