#Find Critical and Pseudo Critical Edges in MST

##Problem Description:
Given an undirected graph with weighted edges, find the critical and pseudo critical edges in the Minimum Spanning Tree (MST). An edge is considered critical if its removal would cause the MST weight to increase. An edge is considered pseudo critical if it can be included in any MST without affecting its weight.

##Example:
Input: n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
Output: [[0,1],[2,3,4,5],[6,7]]

Explanation:
In the given graph, there is a minimum spanning tree of weight 6. There are two critical edges - [0,1] and [6,7]. These edges contribute to the minimum weight of the MST. The remaining edges, [2,3,4,5], are pseudo critical as they do not affect the weight of the MST.

##Constraints:
- 2 <= n <= 100
- 1 <= edges.length <= min(200, n * (n - 1) / 2)
- edges[i].length == 3
- 0 <= from < to < n
- 1 <= weight <= 1000
- All pairs (from, to) are distinct.