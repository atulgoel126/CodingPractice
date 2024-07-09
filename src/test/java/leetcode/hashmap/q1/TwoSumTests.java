package leetcode.hashmap.q1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.hashmap.q1.TwoSum;

public class TwoSumTests {
    @Test
    public void testTwoSum() {
        TwoSum ob = new TwoSum();

        // Basic test case with positive numbers
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedOutput = {0, 1};
        int[] actualOutput = ob.twoSum(nums, target);
        assertArrayEquals(expectedOutput, actualOutput);

        // Multiple solutions, should return first occurrence
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expectedOutput2 = {1, 2};
        int[] actualOutput2 = ob.twoSum(nums2, target2);
        assertArrayEquals(expectedOutput2, actualOutput2);

        // Edge case: target is equal to one of the numbers in the array
        int[] nums3 = {2, 7, 11, 15};
        int target3 = 15;
        int[] expectedOutput3 = {0, 3};
        int[] actualOutput3 = ob.twoSum(nums3, target3);
        assertArrayEquals(expectedOutput3, actualOutput3);

        // Edge case: Empty array
        int[] nums4 = {};
        int target4 = 9;
        int[] expectedOutput4 = null;
        int[] actualOutput4 = ob.twoSum(nums4, target4);
        assertArrayEquals(expectedOutput4, actualOutput4);

        // Edge case: Negative numbers
        int[] nums5 = {-2, 1, 5, -3};
        int target5 = -5;
        int[] expectedOutput5 = {1, 3};
        int[] actualOutput5 = ob.twoSum(nums5, target5);
        assertArrayEquals(expectedOutput5, actualOutput5);

        // Invalid input: Target is less than all numbers in the array
        int[] nums6 = {2, 7, 11, 15};
        int target6 = 1;
        int[] expectedOutput6 = null;
        int[] actualOutput6 = ob.twoSum(nums6, target6);
        assertArrayEquals(expectedOutput6, actualOutput6);
    }
}