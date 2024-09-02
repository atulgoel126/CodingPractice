package leetcode.dynamic_programming.q152;

import java.math.BigInteger;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        BigInteger minInt = BigInteger.ZERO;
        BigInteger p = BigInteger.ONE;

        for (int n: nums) {
            p = p.multiply(BigInteger.valueOf(n));
            minInt = minInt.max(p);
            if (p.equals(BigInteger.ZERO)) {
                p = BigInteger.ONE;
            }
        }
        p = BigInteger.ONE;

        for (int i = nums.length - 1; i >= 0; i--) {
            p = p.multiply(BigInteger.valueOf(nums[i]));
            minInt = minInt.max(p);
            if (p.equals(BigInteger.ZERO)) {
                p = BigInteger.ONE;
            }
        }
        return minInt.intValue();
    }
}
