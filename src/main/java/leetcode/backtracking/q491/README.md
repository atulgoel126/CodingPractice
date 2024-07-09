## Question Description: "Increasing Subsequences"

Given an integer array `nums`, return all **increasing subsequences** of length **two** or more such that the elements in the subsequence are in **strictly increasing order**.

A **subsequence** is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements.

**Example 1:**

Input: nums = [4,6,7,7]
Output: [[4,6],[4,7],[4,6,7],[6,7],[4,7,7],[6,7,7],[4,6,7,7]]

**Example 2:**

Input: nums = [4,4,3,2,1]
Output: [[4,4]]

**Constraints:**

- 1 <= nums.length <= 15
- -100 <= nums[i] <= 100

**Note:**

- The subsequence must be in **strictly increasing** order.
- The answer contains **repeated** instances of the same subsequence in different positions in the list.