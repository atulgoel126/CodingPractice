# Word Pattern

Given a "pattern" string and a string "s", find if "s" follows the same pattern.

Here, "follow" means a full match, such that there is a bijection between a letter in "pattern" and a non-empty word in "s".

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:

Input:pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

Example 4:

Input: pattern = "abba", s = "dog dog dog dog"
Output: false

Notes:

- You may assume "pattern" contains only lowercase letters, and "s" contains lowercase letters that may be separated by a single space.
- Time complexity: O(N) where N is the length of "string".
- Space complexity: O(M) where M is the number of distinct words in "string".