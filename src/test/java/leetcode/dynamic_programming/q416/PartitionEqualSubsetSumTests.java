package leetcode.dynamic_programming.q416;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.dynamic_programming.q416.PartitionEqualSubsetSum;

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
        assertFalse(ob.canPartition(nums));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {100, 200, 150, 50, 250, 350};
        assertTrue(ob.canPartition(nums));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, 5, -11, 6};
        assertTrue(ob.canPartition(nums));
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

//    @Test
//    public void testNegativeTargetSum() {
//        int[] nums = {1, 2, 3, 4};
//        assertFalse(ob.canPartition(nums), -10);
//    }
//
//    @Test
//    public void testZeroTargetSum() {
//        int[] nums = {1, 2, 3, 4};
//        assertTrue(ob.canPartition(nums, 0));
//    }
//
//    @Test
//    public void testTargetSumLargerThanTotalSum() {
//        int[] nums = {2, 2, 3, 1};
//        assertFalse(ob.canPartition(nums, 10));
//    }
//
//    @Test
//    public void testTargetSumEqualsTotalSum() {
//        int[] nums = {3, 5, 8, 9, 2};
//        assertTrue(ob.canPartition(nums, 27));
//    }
}