package leetcode.sorting_searching.q34;

import java.util.Arrays;

public class FirstLastPositionSortedArray {
    public int[] searchRange(int[] nums, int target) {

        // find any index of target
        int index = Arrays.binarySearch(nums, target);

        if (index < 0) {
            return new int[]{-1, -1};
        }

        int leftEdge = expandSearchLeft(nums, index);
        int rightEdge = expandSearchRight(nums, index);

        return new int[]{leftEdge, rightEdge};
    }

    private int expandSearchRight(int[] nums, int index) {
        // we know that nums[index] == target
        int target = nums[index];
        int left = index;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                // this will only happen when nums[mid] == target
                left = mid;
            }
        }
        return left;
    }

    private int expandSearchLeft(int[] nums, int index) {
        // we know that nums[index] == target
        int target = nums[index];
        int left = 0;
        int right = index;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                // this will only happen when nums[mid] == target
                right = mid;
            }
        }
        return right;
    }
}
