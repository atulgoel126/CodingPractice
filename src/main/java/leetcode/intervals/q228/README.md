#Summary Ranges

Given a sorted integer array nums, return the summary of its ranges.
A range is a consecutive sequence of numbers where all numbers are consecutive integers, such as [1,2,3,4]. The summary ranges should be in the form of a list of strings, where each string contains the starting and ending number of the range separated by a hyphen.

Example 1:
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]

Example 2:
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]

Constraints:
1 <= nums.length <= 100
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.