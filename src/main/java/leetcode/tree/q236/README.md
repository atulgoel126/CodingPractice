### Lowest Common Ancestor of a Binary Tree

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA, the lowest common ancestor is the deepest node in the tree that has both given nodes as descendants (where we allow a node to be a descendant of itself).

The input will be two distinct integers representing the values of the two nodes to be found in the tree.

You may assume that both nodes exist in the tree.

Example 1:
```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The lowest common ancestor of nodes 5 and 1 is 3.
```

Example 2:
```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The lowest common ancestor of nodes 5 and 4 is 5, since there is no node beneath 5 that is a common ancestor of 5 and 4.
```

Constraints:

- The number of nodes in the tree is in the range [2, 10000].
- -10^9 <= Node.val <= 10^9
- `All Node.val` are unique.
- `p != q`
- `p` and `q` will exist in the tree.