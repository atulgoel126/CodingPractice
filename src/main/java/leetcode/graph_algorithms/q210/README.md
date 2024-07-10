# Course Schedule II

Given a list of courses with prerequisite relationships, return the correct order in which courses should be taken to complete all courses.

**Example:**

Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
Output: [0,1,2,3] or [0,2,1,3]

**Constraints:**

- The input prerequisites is a graph represented by a list of edges, not adjacency matrices.
- You may assume that there are no duplicate edges in the input prerequisites.
- 1 <= numCourses <= 2000