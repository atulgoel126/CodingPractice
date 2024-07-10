# Construct Binary Tree from Preorder and Inorder Traversal

Given two arrays `preorder` and `inorder` which represent the preorder and inorder traversal sequences of a binary tree, construct the binary tree and return its root.

Note:
You may assume that duplicates do not exist in the tree.

Example:

Input:
preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]

Output: [3,9,20,null,null,15,7]

Explanation: 
The preorder traversal sequence `[3,9,20,15,7]` means that the root is the first element, which is `3`. Then we use `3` to divide the inorder traversal sequence `[9,3,15,20,7]` into two left and right subtrees. For the preorder traversal sequence, we use `3` as the root, then the following elements `9` and `20` are the left and right child of the root `3`, respectively. Similarly, we can obtain the rest of the tree.