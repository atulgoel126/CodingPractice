package leetcode.array_string.q238;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        Arrays.fill(product, 1);

        int temp = 1;

        for (int i = 0; i < nums.length; i++) {
            product[i] = temp;
            temp = temp * nums[i];
        }

        temp = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            product[i] = product[i] * temp;
            temp = temp * nums[i];
        }
        return product;
    }
}


//   1, 2, 3, 4, 5

// 1, 2, 6, 24, 120

// 120,

// 120,60,40,30,24
