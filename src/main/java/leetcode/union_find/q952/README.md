# Largest Component Size by Common Factor

Given an array of positive integers `A`, find the largest possible size of a set of numbers in the array that are mutually divisible by a common factor.

Note: The common factor may not necessarily be the greatest common divisor (GCD) of the numbers.

Example 1:
Input: [4, 6, 15, 27]
Output: 2
Explanation: The largest set of numbers that are mutually divisible by a common factor are [4, 6] and [15, 27].

Example 2:
Input: [4, 8, 16, 32]
Output: 4
Explanation: The entire array is a set where all numbers are mutually divisible by the common factor of 4.

Note:
- 1 <= A.length <= 10000
- 1 <= A[i] <= 100000

Link: https://leetcode.com/problems/largest-component-size-by-common-factor/