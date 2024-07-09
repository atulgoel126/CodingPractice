# Candy - Leetcode

Given an integer array ratings representing the candy ratings of each student, return the minimum number of candies that must be given to the students according to the following rules:
- Each student must have at least one candy.
- Students with a higher rating get more candies than their neighbors.

Example 1:
Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third student with 2, 1, 2 candies.
 
Example 2:
Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third student with 1, 2, 1 candies. The third student gets 1 candy because it satisfies the above two conditions.