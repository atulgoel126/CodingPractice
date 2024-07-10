# Redundant Connection

## Description

Given a directed graph, find the **redundant connection**. The given graph consists of **N** nodes labeled from **1** to **N**. The graph may have self-loops and parallel edges.

If there are multiple answers, return the answer that occurs last in the given 2D-array. The answer **should contain exactly** two different vertices in the edge, regardless of the order. Each edge will be given as an array of size 2, where the vertices are represented as integers ranging from **1** to **N**. Each entry **trips[i] = [x, y]** represents a directed edge connecting nodes **x** and **y**, where **x** is a parent and **y** is a child.

Example 1:
```bash
Input: [[1,2], [1,3], [2,3]]
Output: [2,3]
Explanation: The given redundant connection is [2,3], because there are already edges from 2 -> 3 and 1 -> 3.
```

Example 2:
```bash
Input: [[1,2], [2,3], [3,4], [1,4], [1,5]]
Output: [1,4]
Explanation: The given redundant connection is [1,4], because there is already an edge from 1 -> 4, making the graph contain a cycle.
```

Note:
- The size of the input 2D-array will be between **3** and **1000**.
- Every integer represented in the 2D-array will be between **1** and **N**, where **N** is the size of the input array.