# Coding Practice

This is a personal project to practice coding and writing tests. The provided shell script helps create a structured layout for solving coding problems and writing corresponding unit tests.

## Script Overview

The shell script (`create_leetcode_structure.sh`) is used to create a directory structure for coding problems and their tests. It ensures that each problem has its own directory with a Java file for the solution and a corresponding test file.

## Usage

To use the script, run it with the required arguments:

```sh
./create_leetcode_structure.sh <question number> <QuestionTitle>
```

### Example

```sh
./create_structure.sh 1 TwoSum
```
This command will:

1. Create the necessary directories for the problem and test.
2. Generate a Java file for the problem (TwoSum.java) in the appropriate directory.
3. Generate a corresponding test file (TwoSumTests.java).
4. Create a README.md file in the problem's directory.


## Project Structure

The project follows a specific directory structure to organize the problems and their tests. 
Here is an example of the structure after running the script:

```css
.
├── src
│   ├── main
│   │   └── java
│   │       └── leetcode
│   │           └── q1
│   │               ├── TwoSum.java
│   │               └── README.md
│   └── test
│       └── java
            └── leetcode
│               └── q1
│                   └── TwoSumTests.java
└── create_structure.sh
```

### Generated Files

* **src/main/java/leetcode/q1/TwoSum.java**: Java file containing the solution for the problem.
* **src/test/java/q1/TwoSumTests.java**: Java file containing the unit tests for the problem.
* **src/main/java/leetcode/q1/README.md**: README file specific to the problem, to provide additional details or documentation.


### Additional Notes

- Ensure that the script (`create_leetcode_structure.sh`) is executable. You can make it executable by running:
  ```sh
  chmod +x create_leetcode_structure.sh

## My Study Plan

### Heap/Priority Queue (10 Medium Questions)
1. **Question #347 (Medium)** - Top K Frequent Elements
2. **Question #692 (Medium)** - Top K Frequent Words
3. **Question #451 (Medium)** - Sort Characters By Frequency
4. **Question #973 (Medium)** - K Closest Points to Origin
5. **Question #1167 (Medium)** - Minimum Cost to Connect Sticks
6. **Question #215 (Medium)** - Kth Largest Element in an Array
7. **Question #378 (Medium)** - Kth Smallest Element in a Sorted Matrix
8. **Question #846 (Medium)** - Hand of Straights
9. **Question #373 (Medium)** - Find K Pairs with Smallest Sums
10. **Question #759 (Medium)** - Employee Free Time

### Sorting/Searching (5 Medium Questions)
1. **Question #34 (Medium)** - Find First and Last Position of Element in Sorted Array
2. **Question #347 (Medium)** - Top K Frequent Elements
3. **Question #658 (Medium)** - Find K Closest Elements
4. **Question #912 (Medium)** - Sort an Array
5. **Question #162 (Medium)** - Find Peak Element

### Dijkstra's Algorithm (3 Questions)
1. **Question #743 (Medium)** - Network Delay Time
2. **Question #787 (Medium)** - Cheapest Flights Within K Stops
3. **Question #1631 (Medium)** - Path With Minimum Effort

### Prim's Algorithm (2 Questions)
1. **Question #1584 (Medium)** - Min Cost to Connect All Points
2. **Question #1135 (Medium)** - Connecting Cities With Minimum Cost

### Union Find (4 Questions)
1. **Question #684 (Medium)** - Redundant Connection
2. **Question #721 (Medium)** - Accounts Merge
3. **Question #952 (Hard)** - Largest Component Size by Common Factor
4. **Question #1202 (Medium)** - Smallest String With Swaps

### Minimum Spanning Tree (2 Questions)
1. **Question #1584 (Medium)** - Min Cost to Connect All Points
2. **Question #1135 (Medium)** - Connecting Cities With Minimum Cost

### Kruskal's Algorithm (2 Questions)
1. **Question #1584 (Medium)** - Min Cost to Connect All Points
2. **Question #1135 (Medium)** - Connecting Cities With Minimum Cost

### Tree (15 Medium Questions)
1. **Question #103 (Medium)** - Binary Tree Zigzag Level Order Traversal
2. **Question #105 (Medium)** - Construct Binary Tree from Preorder and Inorder Traversal
3. **Question #114 (Medium)** - Flatten Binary Tree to Linked List
4. **Question #144 (Medium)** - Binary Tree Preorder Traversal
5. **Question #199 (Medium)** - Binary Tree Right Side View
6. **Question #222 (Medium)** - Count Complete Tree Nodes
7. **Question #230 (Medium)** - Kth Smallest Element in a BST
8. **Question #236 (Medium)** - Lowest Common Ancestor of a Binary Tree
9. **Question #297 (Hard)** - Serialize and Deserialize Binary Tree
10. **Question #337 (Medium)** - House Robber III
11. **Question #508 (Medium)** - Most Frequent Subtree Sum
12. **Question #513 (Medium)** - Find Bottom Left Tree Value
13. **Question #515 (Medium)** - Find Largest Value in Each Tree Row
14. **Question #662 (Medium)** - Maximum Width of Binary Tree
15. **Question #958 (Medium)** - Check Completeness of a Binary Tree

### Backtracking (10 Medium Questions)
1. **Question #39 (Medium)** - Combination Sum
2. **Question #46 (Medium)** - Permutations
3. **Question #78 (Medium)** - Subsets
4. **Question #90 (Medium)** - Subsets II
5. **Question #131 (Medium)** - Palindrome Partitioning
6. **Question #212 (Hard)** - Word Search II
7. **Question #216 (Medium)** - Combination Sum III
8. **Question #306 (Medium)** - Additive Number
9. **Question #491 (Medium)** - Increasing Subsequences
10. **Question #784 (Medium)** - Letter Case Permutation

### Dynamic Programming (8 Questions)
1. **Question #70 (Easy)** - Climbing Stairs
2. **Question #91 (Medium)** - Decode Ways
3. **Question #198 (Medium)** - House Robber
4. **Question #300 (Medium)** - Longest Increasing Subsequence
5. **Question #322 (Medium)** - Coin Change
6. **Question #416 (Medium)** - Partition Equal Subset Sum
7. **Question #494 (Medium)** - Target Sum
8. **Question #152 (Medium)** - Maximum Product Subarray

### Recursion with Strings (5 Questions)
1. **Question #22 (Medium)** - Generate Parentheses
2. **Question #44 (Hard)** - Wildcard Matching
3. **Question #93 (Medium)** - Restore IP Addresses
4. **Question #131 (Medium)** - Palindrome Partitioning
5. **Question #301 (Hard)** - Remove Invalid Parentheses

### Array / String (20 Questions)
1. **Question #88 (Easy)** - Merge Sorted Array
2. **Question #27 (Easy)** - Remove Element
3. **Question #26 (Easy)** - Remove Duplicates from Sorted Array
4. **Question #80 (Medium)** - Remove Duplicates from Sorted Array II
5. **Question #169 (Easy)** - Majority Element
6. **Question #189 (Medium)** - Rotate Array
7. **Question #121 (Easy)** - Best Time to Buy and Sell Stock
8. **Question #122 (Medium)** - Best Time to Buy and Sell Stock II
9. **Question #55 (Medium)** - Jump Game
10. **Question #45 (Medium)** - Jump Game II
11. **Question #274 (Medium)** - H-Index
12. **Question #380 (Medium)** - Insert Delete GetRandom O(1)
13. **Question #238 (Medium)** - Product of Array Except Self
14. **Question #134 (Medium)** - Gas Station
15. **Question #135 (Hard)** - Candy
16. **Question #42 (Hard)** - Trapping Rain Water
17. **Question #13 (Easy)** - Roman to Integer
18. **Question #12 (Medium)** - Integer to Roman
19. **Question #58 (Easy)** - Length of Last Word
20. **Question #14 (Easy)** - Longest Common Prefix

### Two Pointers (7 Questions)
1. **Question #125 (Easy)** - Valid Palindrome
2. **Question #392 (Easy)** - Is Subsequence
3. **Question #167 (Medium)** - Two Sum II - Input Array Is Sorted
4. **Question #11 (Medium)** - Container With Most Water
5. **Question #15 (Medium)** - 3Sum
6. **Question #209 (Medium)** - Minimum Size Subarray Sum
7. **Question #3 (Medium)** - Longest Substring Without Repeating Characters

### Sliding Window (2 Questions)
1. **Question #30 (Hard)** - Substring with Concatenation of All Words
2. **Question #76 (Hard)** - Minimum Window Substring

### Matrix (5 Questions)
1. **Question #36 (Medium)** - Valid Sudoku
2. **Question #54 (Medium)** - Spiral Matrix
3. **Question #48 (Medium)** - Rotate Image
4. **Question #73 (Medium)** - Set Matrix Zeroes
5. **Question #289 (Medium)** - Game of Life

### Hashmap (9 Questions)
1. **Question #383 (Easy)** - Ransom Note
2. **Question #205 (Easy)** - Isomorphic Strings
3. **Question #290 (Easy)** - Word Pattern
4. **Question #242 (Easy)** - Valid Anagram
5. **Question #49 (Medium)** - Group Anagrams
6. **Question #1 (Easy)** - Two Sum
7. **Question #202 (Easy)** - Happy Number
8. **Question #219 (Easy)** - Contains Duplicate II
9. **Question #128 (Medium)** - Longest Consecutive Sequence

### Intervals (4 Questions)
1. **Question #228 (Easy)** - Summary Ranges
2. **Question #56 (Medium)** - Merge Intervals
3. **Question #57 (Medium)** - Insert Interval
4. **Question #452 (Medium)** - Minimum Number of Arrows to Burst Balloons
5. **Question #435 (Medium)** - Non-overlapping Intervals

### Stack (5 Questions)
1. **Question #20 (Easy)** - Valid Parentheses
2. **Question #71 (Medium)** - Simplify Path
3. **Question #155 (Medium)** - Min Stack
4. **Question #150 (Medium)** - Evaluate Reverse Polish Notation
5. **Question #224 (Hard)** - Basic Calculator

### Linked List (10 Questions)
1. **Question #141 (Easy)** - Linked List Cycle
2. **Question #2 (Medium)** - Add Two Numbers
3. **Question #21 (Easy)** - Merge Two


## Total - 143 problems
## Completed - 5 problems