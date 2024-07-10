# Top K Frequent Words

Given a non-empty list of words, return the k most frequent elements.
 
Note:
- You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
- Input words contain only lowercase letters.
 
Example 1:

Input: ["rose", "car", "apple", "apple", "rose", "car", "car"]
k = 2

Output: ["car", "rose"] 

Explanation: "car" and "rose" are the two most frequent words. 
Note that returning "rose", "car" is ordered alphabetically.
 
Example 2:

Input: ["a", "a", "b", "b", "c", "c", "d", "d", "e", "e", "e", "e"]
k = 3

Output: ["e", "a", "b"]

Explanation: "e", "a" and "b" are the three most frequent words. 
Note that returning "e", "a", "b" is ordered by number of occurrences of each word.