# Serialize and Deserialize Binary Tree

## Description:
Given the root of a binary tree, implement two methods to serialize and deserialize the tree. The "serialize" method should convert the tree into a string with a unique representation of the tree's structure and values. The "deserialize" method should take this string and reconstruct the original tree. It is guaranteed that the input tree will be non-empty. 

## Example 1:

Input: root = [1,2,3,null,null,4,5]
Output: [root = 1, left = 2, right = 3, right.left = 4, right.right = 5]

Explanation:
The above tree is serialized as "[1,2,3,null,null,4,5]" and each node is represented as a pair of [val, left, right] as described in the problem statement.

Constraints:
- The number of nodes in the tree is in the range [0, 10^4].
- -1000 <= Node.val <= 1000
- The input tree is guaranteed to be a binary tree.