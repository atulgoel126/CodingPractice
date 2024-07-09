# Copy List with Random Pointer

Given a linked list consisting of `n` nodes. Each node is represented as a pair of `[val, random]` where `val` is the value of the node and `random` is a reference to a random node in the list or null if there is no random node.

Return a deep copy of the list. The cloned list should have the same structure and connections as the original list and should have the same `random` references.

Example 1:

```
Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
```

Example 2:

```
Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
```

Example 3:

```
Input: head = []
Output: []
Explanation: The given linked list is empty (null pointer), so return null.
```

Constraints:

- `0 <= n <= 1000`
- `-10000 <= Node.val <= 10000`
- `Node.random` is null or pointing to a node in the linked list.