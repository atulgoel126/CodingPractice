# Minimum Cost to Connect Sticks

Given an array of integers `sticks` where each element represents the length of a stick, return the minimum cost to connect all the sticks into one stick. The cost of connecting two sticks is equal to the sum of their lengths. 
You must connect all the sticks together using the minimum possible total cost. 

**Example 1:**

Input: sticks = [2,4,3]
Output: 14
Explanation: You start with sticks = [2,4,3].
1. Combine sticks 2 and 3 for a cost of 3 to create a new stick [3].
2. Combine the previous two sticks [3] and 4 for a cost of 4 to create a new stick [7].
3. Combine the previous two sticks [4] and 7 for a cost of 11 to create a new stick [11].
Total cost is 3 + 4 + 11 = 14.

**Example 2:**
Input: sticks = [1,8,3,5]
Output: 30
Explanation: You start with sticks = [1,8,3,5].
1. Combine sticks 1 and 3 for a cost of 4 to create a new stick [4].
2. Combine sticks 4 and 5 for a cost of 9 to create a new stick [9].
3. Combine the previous two sticks [8] and 9 for a cost of 17 to create a new stick [17].
Total cost is 4 + 9 + 17 = 30.

**Constraints:**
- 1 <= sticks.length <= 10^4
- 1 <= sticks[i] <= 10^4