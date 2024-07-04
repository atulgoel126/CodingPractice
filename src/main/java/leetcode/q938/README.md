# 938. Range Sum of BST

## Problem Statement
Given the root node of a binary search tree, and two integers `low` and `high`, the task is to return the sum of values of all nodes with a value in the inclusive range `[low, high]`.

The problem is already solved and has been rated as an easy difficulty level problem.

### Example 1
**Input:** root = [10,5,15,3,7,null,18],low = 7, high = 15  
**Output:** 32  
**Explanation:** Nodes 7, 10, and 15 are in the range [7, 15], which sum up to 32 (i.e., 7 + 10 + 15 = 32).

### Example 2
**Input:** root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10  
**Output:** 23  
**Explanation:** Nodes 6, 7, and 10 are in the range [6, 10], which sum up to 23 (i.e., 6 + 7 + 10 = 23).

### Constraints
* The number of nodes in the tree is in the range from 1 to 2*10^4.
* 1 <= Node.val <= 105.
* The values `low` and `high` are integers within the range [1, 105], with `low` less than or equal to `high`.
* Each node value (`Node.val`) in the tree is guaranteed to be unique.