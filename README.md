# Coding Practice
This is a personal project to practice coding and writing tests. The provided shell script helps create a structured layout for solving coding problems and writing corresponding unit tests. Additionally, a NodeJS sub-project is included to automatically generate content for the README and test files using ChatGPT.

## Script Overview
```create_leetcode_structure.sh```
The shell script (create_leetcode_structure.sh) is used to create a directory structure for coding problems and their tests. It ensures that each problem has its own directory with a Java file for the solution, a corresponding test file, and a README file.

```bulk_create_leetcode_structure.sh```
The shell script (bulk_create_leetcode_structure.sh) automates the execution of create_leetcode_structure.sh for multiple questions listed in a JSON file (questions.json). It also installs jq if it's not already installed.

```generate-content.js```
The NodeJS script (generate-content.js) uses the ChatGPT API to insert data into the README and test files for each question. It reads the questions from the questions.json file and generates comprehensive descriptions and test cases.

## Usage
```shell
create_leetcode_structure.sh
```
To use the script, run it with the required arguments:
```shell
./create_leetcode_structure.sh <QuestionNumber> <QuestionTitle> <Topic>
```

### Example
```shell
./create_leetcode_structure.sh 1 TwoSum array_string
```

This command will:

* Create the necessary directories for the problem and test.
* Generate a Java file for the problem (TwoSum.java) in the appropriate directory.
* Generate a corresponding test file (TwoSumTests.java).
* Create a README.md file in the problem's directory.

## Usage

```shell
bulk_create_leetcode_structure.sh
```

To automate the creation of the structure for multiple questions:

```shell
./bulk_create_leetcode_structure.sh
```

This script reads the list of questions from the questions.json file and runs create_leetcode_structure.sh for each one.

## Usage
```
generate-content.js
```

To use the NodeJS script for generating content:

 - Set your ChatGPT API key in the terminal:

```shell
export CHATGPT_API_KEY=your_api_key_here
```


Run the script:
```shell
node generate-content.js
```

This script will generate content for the README and test files for each question listed in the questions.json file.

## Project Structure
The project follows a specific directory structure to organize the problems and their tests. Here is an example of the structure after running the scripts:

```css
.
├── src
│   ├── main
│   │   └── java
│   │       └── leetcode
│   │           ├── array_string
│   │           │   └── q1
│   │           │       ├── TwoSum.java
│   │           │       └── README.md
│   │           └── prims_algorithm
│   │               └── q1135
│   │                   ├── ConnectingCitiesMinCost.java
│   │                   └── README.md
│   └── test
│       └── java
│           └── leetcode
│               ├── array_string
│               │   └── q1
│               │       └── TwoSumTests.java
│               └── prims_algorithm
│                   └── q1135
│                       └── ConnectingCitiesMinCostTests.java
├── leetcode-chatgpt
│   ├── generate-content.js
│   ├── package.json
│   └── .env
├── questions.json
├── run_leetcode_structure.sh
└── create_leetcode_structure.sh
```
### Generated Files
* src/main/java/leetcode/<topic>/q<number>/<QuestionTitle>.java: Java file containing the solution for the problem.
* src/test/java/leetcode/<topic>/q<number>/<QuestionTitle>Tests.java: Java file containing the unit tests for the problem.
* src/main/java/leetcode/<topic>/q<number>/README.md: README file specific to the problem, to provide additional details or documentation.

## Additional Notes
 - Ensure that the scripts (create_leetcode_structure.sh and bulk_create_leetcode_structure.sh) are executable. You can make them executable by running:

```shell
chmod +x create_leetcode_structure.sh run_leetcode_structure.sh
```

- Make sure you have jq installed. The run_leetcode_structure.sh script will attempt to install it if it's not already available.

 - Set your ChatGPT API key before running the NodeJS script to generate content:

This setup provides a comprehensive structure and automation for practicing coding problems, writing tests, and generating necessary documentation using ChatGPT.
## My Study Plan

### Heap/Priority Queue (10 Medium Questions)
1. ✅ **Question #347 (Medium)** - Top K Frequent Elements
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
1. ✅ **Question #34 (Medium)** - Find First and Last Position of Element in Sorted Array
2. ✅ **Question #658 (Medium)** - Find K Closest Elements
3. ✅ **Question #912 (Medium)** - Sort an Array
4. ✅ **Question #162 (Medium)** - Find Peak Element

### Dijkstra's Algorithm (3 Questions)
1. **Question #743 (Medium)** - Network Delay Time
2. **Question #787 (Medium)** - Cheapest Flights Within K Stops
3. **Question #1631 (Medium)** - Path With Minimum Effort

### Prim's Algorithm (2 Questions)
1. ✅ **Question #1584 (Medium)** - Min Cost to Connect All Points
2. ✅ **Question #1135 (Medium)** - Connecting Cities With Minimum Cost

### Union Find (4 Questions)
1. **Question #684 (Medium)** - Redundant Connection
2. **Question #721 (Medium)** - Accounts Merge
3. **Question #952 (Hard)** - Largest Component Size by Common Factor
4. **Question #1202 (Medium)** - Smallest String With Swaps

### Minimum Spanning Tree (2 Questions)
1. **Question #1584 (Medium)** - Min Cost to Connect All Points
2. **Question #1135 (Medium)** - Connecting Cities With Minimum Cost
3. **Question #1168 (Medium)** - Optimize Water Distribution in a Village 
4. **Question #1489 (Hard)** - Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree

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
1. ✅ **Question #22 (Medium)** - Generate Parentheses
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
3. **Question #438 (Medium)** - Find All Anagrams in a String 
4. **Question #567 (Medium)** - Permutation in String

### Matrix (5 Questions)
1. ✅ **Question #36 (Medium)** - Valid Sudoku
2. ✅ **Question #54 (Medium)** - Spiral Matrix
3. ✅ **Question #48 (Medium)** - Rotate Image
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
2. ✅ **Question #2 (Medium)** - Add Two Numbers
3. **Question #21 (Easy)** - Merge Two Sorted Lists
4. **Question #138 (Medium)** - Copy List with Random Pointer
5. **Question #92 (Medium)** - Reverse Linked List II
6. **Question #25 (Hard)** - Reverse Nodes in k-Group
7. ✅ **Question #19 (Medium)** - Remove Nth Node From End of List
8. ✅ **Question #82 (Medium)** - Remove Duplicates from Sorted List II
9. **Question #61 (Medium)** - Rotate List
10. **Question #86 (Medium)** - Partition List

### Trie (2 Questions)

1. **Question #208 (Medium)** - Implement Trie (Prefix Tree)
2. **Question #648 (Medium)** - Search Suggestions System

### Monotonic Stack (2 Questions)

1. **Question #739 (Medium)** - Daily Temperatures
2. **Question #901 (Medium)** - Online Stock Span

### Graph Algorithms (4 Questions)
1. **Question #207 (Medium)** - Course Schedule
2. **Question #210 (Medium)** - Course Schedule II
3. **Question #133 (Medium)** - Clone Graph
4. **Question #417 (Medium)** - Pacific Atlantic Water Flow

### Misc Questions
1. ✅ **Question #72 (Medium)** - Edit Distance
2. ✅ **Question #146 (Medium)** - LRU Cache
3. ✅ **Question #200 (Medium)** - Number of Islands
4. ✅ **Question #938 (Easy)** - Range Sum of BST

## Total - 145 problems
## Completed - 18 problems