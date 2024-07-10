Leetcode Problem 306: Additive Number

Given a string num representing an integer, return true if it can be represented as an additive number.

An additive number is a string whose digits can form additively linked numbers. This means the first two numbers must sum up to the third number, the first three numbers must sum up to the fourth number, and so on. 

Note that numbers in the additive sequence cannot have leading zeros, except for the number 0 itself.

Example 1:
Input: num = "112358"
Output: true
Explanation: The digits can form an additive sequence "1, 1, 2, 3, 5, 8".
1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8, so on...

Example 2:
Input: num = "199100199"
Output: true
Explanation: The additive sequence is: "1, 99, 100, 199".
1 + 99 = 100, 99 + 100 = 199, so on...

Constraints:
- num consists only of digits.
- 1 <= num.length <= 35