# Implement Trie (Prefix Tree)

### Description
A trie (or prefix tree) is a special type of tree used to store strings efficiently. In a trie, each node represents a single character of a string and all descendants of a node have a common prefix associated with that node. This allows for efficient search operations for words with a certain prefix. 

In this problem, you are tasked with implementing a trie data structure that supports the following operations:
- `insert` : Insert a word into the trie.
- `search` : Check if a word exists in the trie.
- `startsWith` : Check if there is a word in the trie that starts with the given prefix.

You may assume that all inputs are composed of lowercase letters `a-z`. All operations should be performed in `O(1)` time complexity. 

You can find a detailed description of the trie data structure and its operations here: [Trie (Wikipedia)](https://en.wikipedia.org/wiki/Trie)

### Example:
```
Trie trie = new Trie();

trie.insert("apple");
trie.search("apple"); // returns true
trie.search("app"); // returns false
trie.startsWith("app"); // returns true
trie.insert("app"); 
trie.search("app"); // returns true
```

### Constraints:
- `0 <= word.length, prefix.length <= 2000`
- `word` and `prefix` consist only of lowercase English letters.
- At most `3 * 10^4` calls will be made to `insert`, `search`, `startsWith`.