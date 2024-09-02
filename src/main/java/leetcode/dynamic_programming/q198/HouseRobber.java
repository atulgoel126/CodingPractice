package leetcode.dynamic_programming.q198;

import java.util.Arrays;

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] cache = new int[nums.length + 3];
        Arrays.fill(cache, -1);
        int firstStart = helper(nums, 0, cache);
        int secondStart = helper(nums, 1, cache);
        return Math.max(firstStart, secondStart);
    }

    /**
     * recursive helper function to calculate the max possible amount that can be robbed.
     * breaks down the problem into smaller steps - each step only care about its past and whether it should skip one or two
     * @param nums amount of money in each house
     * @param index current index the function needs to consider
     * @param cache store the computed value for memoization
     * @return max possible money that can be robbed starting from @param index
     */
    private int helper(int[] nums, int index, int[] cache) {
        if (index > nums.length - 1) {
            return 0;
        }
        if (cache[index] != -1) {
            return cache[index];
        }
        int skipOne = helper(nums, index + 2, cache);
        cache[index + 2] = skipOne;
        int skipTwo = helper(nums, index + 3, cache);
        cache[index + 3] = skipTwo;
        return nums[index] + Math.max(skipOne, skipTwo);
    }
}
