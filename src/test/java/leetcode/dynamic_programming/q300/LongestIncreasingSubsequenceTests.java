package leetcode.dynamic_programming.q300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubsequenceTests {

    /**
     * Test case for a simple input where the longest increasing subsequence length is expected to be 4.
     */
    @Test
    public void testSimpleInput() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int expectedLength = 4;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an empty input array where the longest increasing subsequence length is expected to be 0.
     */
    @Test
    public void testEmptyInput() {
        int[] nums = {};
        int expectedLength = 0;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an input array with negative numbers where the longest increasing subsequence length is expected to be 4.
     */
    @Test
    public void testNegativeInput() {
        int[] nums = {1, -2, 3, 0, 7};
        int expectedLength = 3;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an input array with duplicate numbers where the longest increasing subsequence length is expected to be 4.
     */
    @Test
    public void testDuplicateInput() {
        int[] nums = {1, 2, 2, 3, 4, 5, 6};
        int expectedLength = 6;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an input array with all identical numbers where the longest increasing subsequence length is expected to be 1.
     */
    @Test
    public void testAllIdenticalInput() {
        int[] nums = {1, 1, 1, 1, 1};
        int expectedLength = 1;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an input array with alternating increasing and decreasing numbers where the longest increasing subsequence length is expected to be 1.
     */
    @Test
    public void testAlternatingInput() {
        int[] nums = {1, 2, 1, 2, 1};
        int expectedLength = 2;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an input array with only one number where the longest increasing subsequence length is expected to be 1.
     */
    @Test
    public void testSingleInput() {
        int[] nums = {5};
        int expectedLength = 1;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an input array with multiple longest increasing subsequences. In this case, the first one is expected to be returned.
     */
    @Test
    public void testMultipleLongestSubsequences() {
        int[] nums = {4, 10, 4, 3, 8, 9};
        int expectedLength = 3; // [4, 8, 9]

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an input array with a very large number of elements where the longest increasing subsequence length is expected to be returned in a reasonable time.
     */
    @Test
    public void testLargeInput() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i;
        }
        int expectedLength = 1000;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * Test case for an input array with all the same number but with large number of elements where the longest increasing subsequence length is expected to be 1 in a reasonable time.
     */
    @Test
    public void testLargeIdenticalInput() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = 2;
        }
        int expectedLength = 1;

        LongestIncreasingSubsequence ob = new LongestIncreasingSubsequence();
        int actualLength = ob.lengthOfLIS(nums);

        assertEquals(expectedLength, actualLength);
    }
}