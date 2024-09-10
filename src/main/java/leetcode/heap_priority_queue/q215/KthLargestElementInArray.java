package leetcode.heap_priority_queue.q215;

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {

        if ( nums == null || k > nums.length) {
            throw new IllegalArgumentException("Invalid input, please check the array and k values passed.");
        }

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for (int i = 0; i < k; i++) {
            heap.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            int n = nums[i];
            if (n > heap.peek()) {
                heap.poll();
                heap.add(n);
            }
        }
        return heap.peek();
    }}
