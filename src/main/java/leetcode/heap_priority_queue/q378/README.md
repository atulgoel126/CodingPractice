Problem Name: Kth Smallest Element in a Sorted Matrix

Description:
Given an n x n matrix, where each row and column is sorted in non-decreasing order, find the kth smallest element in the matrix.

Note: It is guaranteed that k is in the range [1, n^2] for this problem.

Example 1:
Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13 
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13.

Constraints:
- n == matrix.length
- n == matrix[i].length
- 1 <= n <= 300
- -109 <= matrix[i][j] <= 109
- All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
- 1 <= k <= n^2