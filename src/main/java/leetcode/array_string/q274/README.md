# H-Index

**Problem:** Given an array of citations (total number of papers) of a researcher, write a function to compute their h-index.

The h-index is defined as the maximum number of papers with citation >= h. For example, a researcher with 5 papers and citations [3, 0, 6, 1, 5] has an h-index of 3 as there are 3 papers with citation >= 3.

**Example:**
```
Input: [3, 0, 6, 1, 5]
Output: 3
Explanation: The researcher has 5 papers and the citations of the 3rd, 4th and 5th paper is >= 3.
```

**Note:** If there are multiple possible values for h, the maximum one is taken as the h-index.

**Follow up:**
- This is a follow up problem to H-Index, where citations are now sorted in ascending order.
- Could you solve it in logarithmic time complexity?