# Edit Distance

## Problem Description

Given two strings `word1` and `word2`, return the minimum number of operations required to convert `word1` to `word2`.

You have the following three operations permitted on a word:
1. Insert a character
2. Delete a character
3. Replace a character

## Examples

### Example 1:
**Input:**
```python
word1 = "horse"
word2 = "ros"
```
**Output:** 3

**Explanation:**
```angular2html
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
```

### Example 2:
**Input:**
```python
word1 = "intention"
word2 = "execution"
```
**Output:** 5

**Explanation:**
```angular2html
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
```

## Constraints:
* 0 <= word1.length, word2.length <= 500
* word1 and word2 consist of lowercase English letters.