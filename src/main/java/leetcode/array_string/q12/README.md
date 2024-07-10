Problem Description:

Title: Integer to Roman

Source: Leetcode

Difficulty: Medium

Link: https://leetcode.com/problems/integer-to-roman/

Question:

Given an integer, convert it to a Roman numeral. Input is guaranteed to be within the range from 1 to 3999.

Example:

Input: 3
Output: "III"

Input: 4
Output: "IV"

Input: 9
Output: "IX"

Input: 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

Input: 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Approach:

-Create a dictionary to store the corresponding Roman numeral values for numbers from 1 to 1000.
-Find the highest Roman numeral that is less than or equal to the given integer.
-Subtract the value of the Roman numeral from the given integer and append it to the result string.
-Repeat the above steps until the given integer becomes 0.
-Return the result string as the Roman numeral representation of the given integer.