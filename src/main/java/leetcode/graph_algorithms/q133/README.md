# Clone Graph

Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph. Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.

**Example:**

![Clone Graph Example](https://assets.leetcode.com/uploads/2019/11/04/133_clone_graph_question.png)

Input:
```
{"$id":"1","neighbors":[{"$id":"2","neighbors":[{"$id":"3","neighbors":[{"$ref":"1"},{"$id":"4","neighbors":[{"$ref":"3"},{"$ref":"2"}],"val":4}],"val":3},{"$ref":"4"}],"val":2},{"$ref":"4"}],"val":1}
```

Explanation:
- Node 1's value is 1, and it has two neighbors: Node 2 and 4.
- Node 2's value is 2, and it has two neighbors: Node 1 and 3.
- Node 3's value is 3, and it has two neighbors: Node 2 and 4.
- Node 4's value is 4, and it has two neighbors: Node 1 and 3.

**Note:**

- The number of nodes will be between 1 and 100.
- The undirected graph is a simple graph, which means no repeated edges and no self-loops in the graph.
- Since the graph is undirected, if node  has a neighbor  that means  also has node  as a neighbor.
- All the nodes in the input will be available for cloning.