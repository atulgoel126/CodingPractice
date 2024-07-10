package leetcode.sorting_searching.q34.q658;

import java.util.*;

public class FindKClosestElementsSorted {
    public List<Integer>findClosestElements(int[] arr, int k, int x) {
        // arr = [1,2,3,4,5]
        // k = 3
        // x = 3
        // result = 2,3,4

        // array is sorted in ascending order
        // 1 <= k <= arr.length -> removes risk of most illegal inputs

        // In case of conflict, select the lower i or arr[i]

        // Math.abs(arr[i] - x)
        // int[] delta = {}
        // sort delta[] with ref to arr.
        // get first k elements from delta -> arr


        // arr = [1,2,3,4,5]
        // k = 4
        // x = 3
        // result = 1,2,3,4

        // 1, 2, 3, 4, 5
        // l = 0;
        // r = 4;
        // mid = 2;

        int left = 0;
        int right = arr.length - k;

        while (left < right) {
            int mid = left + (right - left) / 2;
            // range - arr[mid] to arr[mid + k]
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        List<Integer> result = new ArrayList<Integer>(5);
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
