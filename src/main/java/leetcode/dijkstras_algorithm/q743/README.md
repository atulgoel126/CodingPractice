# Network Delay Time

## Description
The "Network Delay Time" problem is a popular coding problem posted on various coding platforms, including Leetcode and the internet. It is a graph theory-based problem that involves calculating the minimum amount of time it takes for a signal to travel from a specific node in a network to all other nodes. 

Given a network with n nodes, where each node has a specific delay time, the objective is to find the maximum delay time for a signal to reach all other nodes from a specified source node. If the signal cannot reach a certain node, the output should be -1.

## Input
The input for this problem consists of three components: 

1. The number of nodes in the network (n)
2. A list of edges denoting the connections between nodes, where each edge consists of an origin node, destination node, and travel time (u, v, w)
3. The starting node for the signal to be sent from (K)

Example input: n = 5, edges = [[1,2,10],[2,3,20],[2,4,5],[3,4,2]], K = 2

## Output
The output for this problem is the maximum delay time for the signal to reach all nodes from the source node K. If the signal cannot reach a certain node, the output should be -1.

Example output: 15 (since the signal takes 15 units of time to reach nodes 1, 3, and 4 from node 2, the starting node)

## Constraints
- 1 <= n <= 100
- 0 <= w <= 100
- 1 <= K <= n

## Example
Input: n = 5, edges = [[1,2,10],[2,3,20],[2,4,5],[3,4,2]], K = 2
Output: 15

Explanation: The signal starts from node 2 and reaches node 1 in 10 units, node 3 in 20 units, and node 4 in 5 units. Since node 1, 3, and 4 are the farthest from node 2, the maximum delay time is 15 units (20 units - 5 units).

## Sources
- Leetcode: https://leetcode.com/problems/network-delay-time/
- GeeksforGeeks: https://www.geeksforgeeks.org/dijkstras-algorithm-for-adjacency-list-representation-greedy-algo-8/