# Combination Sum III

Given a positive integer k and a target integer n, find all unique combinations of k numbers that add up to n. The numbers must be chosen from 1 to 9 without repeating, and each combination should be a unique set of numbers in ascending order. Return an array of all possible combinations that add up to n, sorted in lexicographical order. 

Examples:

Input: k = 3, n = 7
Output: [[1,2,4]]

Explanation:
1 + 2 + 4 = 7
There are no other unique combinations that add up to 7 with 3 numbers.

Input: k = 3, n = 9
Output: [[1,2,6], [1,3,5], [2,3,4]]

Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
These are the only unique combinations that add up to 9 with 3 numbers (k = 3), and each combination is in ascending order.