# Partition List

Given the head node of a linked list and a partition value, partition the list such that all nodes with values less than the partition value come before nodes with values greater than or equal to the partition value. The original relative order of the nodes should be maintained. 

Note: The partition value will always be larger than or equal to the smallest element in the list. 

Example 1:
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]

Example 2:
Input: head = [2,1], x = 2
Output: [1,2]

Constraints:
- The number of nodes in the list is in the range [0, 200].
- -100 <= Node.val <= 100
- -200 <= x <= 200