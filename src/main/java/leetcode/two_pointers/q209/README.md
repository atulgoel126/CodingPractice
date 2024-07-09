# Minimum Size Subarray Sum

Given an array of positive integers `nums` and a target integer `target`, find the minimum length of a contiguous subarray whose sum is greater than or equal to `target`. If there is no such subarray, return 0.

Example 1:

Input: nums = [2,3,1,2,4,3], target = 7
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 
Example 2:

Input: nums = [1,4,4], target = 4
Output: 1
 
Constraints:

- 1 <= target <= 109
- 1 <= nums.length <= 105
- 1 <= nums[i] <= 105