Question Name: Course Schedule

Description:

Given the course requirements and prerequisites for a university semester, determine if it is possible to complete all courses in the given order. 

Each course is represented by an integer, and the prerequisite relation is represented by a pair of integers [a, b] which indicates that course a must be completed before course b. 

Return true if the course schedule can be completed, and false if it is impossible. 

Example: 
Input: numCourses = 4, prerequisites = [[1,0],[2,1],[3,2],[1,3]] 
Output: false 

Explanation: 
Course 3 is a prerequisite of course 1, and both courses 1 and 3 must be completed before course 2. This forms a cycle, making it impossible to complete all courses. 

Note: 
- The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented. 
- You may assume that there are no duplicate edges in the input prerequisites.