# 
Palindrome Partitioning

Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome is a word or phrase that reads the same backward as forward. For example, 'racecar' is a palindrome, while 'apple' is not.

Example:
Input: "aab"

Output:
[
  ["a","a","b"],
  ["aa","b"]
]

Explanation: The palindrome partitioning for "aab" could be:
- ["aa","b"]: where "aa" is a palindrome and "b" is a palindrome. 
- ["a","a","b"]: where "a" is a palindrome and "a" and "b" make up another palindrome. 

Constraints:
- 1 <= s.length <= 16
- s contains only lowercase English letters.

Link to problem: https://leetcode.com/problems/palindrome-partitioning/