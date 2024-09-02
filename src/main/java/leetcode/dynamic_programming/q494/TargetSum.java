package leetcode.dynamic_programming.q494;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    Map<String, Integer> memo = new HashMap<>();

    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, 0, 0, target);
    }

    private int helper(int[] nums, int index, int result, int target) {
        if (index == nums.length) {
            return result == target ? 1 : 0;
        }
        String key = index + "," + result;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int firstResult = result + nums[index];
        int secondResult = result - nums[index];
        int first = helper(nums, index + 1, firstResult, target);
        int second = helper(nums, index + 1, secondResult, target);

        int sum = first + second;
        memo.put(key, sum);

        return sum;
    }
}
