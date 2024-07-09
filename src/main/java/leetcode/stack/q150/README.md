## Evaluate Reverse Polish Notation

### Description
Given an arithmetic expression in Reverse Polish Notation, evaluate the expression and return the result.

Reverse Polish Notation (RPN) is a mathematical notation in which operators follow their operands, in contrast to the usual "infix" notation. For example, the expression "3 + 4" in infix notation is written as "3 4 +" in RPN. Other examples of RPN expressions are "2 3 *" which represents the expression 2 * 3, and "6 2 /" which represents the expression 6 / 2. 

Note:
- Division between two integers should truncate toward zero.
- The given RPN expression is always valid. That means operators and operands will always be in correct order and there won't be any divide by zero operations.

Example 1:
Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

Example 2:
Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

Example 3:
Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
Explanation: 
   ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 = ((10 * (6 / (12 * -11))) + 17) + 5
 = ((10 * (6 / -132)) + 17) + 5
 = ((10 * 0) + 17) + 5
 = (0 + 17) + 5
 = 17 + 5
 = 22