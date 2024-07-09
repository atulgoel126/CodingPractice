Question Description: 
Optimize Water Distribution in a Village

You are given a village with N residential houses and a water tank. The houses are located in a linear layout, where the ith house is located at position x[i]. 
You need to install pipes to connect the water tank to all the houses. The cost of installing a pipe from the water tank to the ith house is given by pipes[i]. 
Return the minimum total cost to supply water to all houses. 

Example 1:

Input: N = 3, pipes = [1,2,2], houses = [3,1,2]
Output: 3
Explanation: The minimum cost is 3, which is obtained by connecting the water tank to the second and third house.

Note:
- N is in the range [1, 10000].
- The size of pipes is in the range [1, 10000].
- The size of houses is in the range [1, 10000].
- No house has more than one pipe connected to it.