# Substring with Concatenation of All Words
Given a string s and a list of words words, find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once. 

Note: The order of words does not matter within the substring. 

Example 1:
Input:
  s = "barfoothefoobarman",
  words = ["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively. 

Example 2:
Input:
  s = "wordgoodgoodgoodbestword",
  words = ["word","good","best","word"]
Output: []