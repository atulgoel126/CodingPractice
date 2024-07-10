# Valid Sudoku

Given a 9x9 grid filled with digits 1-9, determine if a Sudoku is valid.

A Sudoku is considered valid if:

1. Each row contains all digits from 1-9 without repetition.
2. Each column contains all digits from 1-9 without repetition.
3. Each 3x3 subgrid contains all digits from 1-9 without repetition.

The Sudoku board may be partially filled, where empty cells are filled with the character '.'.

Note:

- A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
- The given board contain only digits 1-9 and the character '.'.
- The given board size is always 9x9.

Example 1:
```
Input:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: true
```

Example 2:
```
Input:
[
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: false
```

Explanation: The top left 3x3 subgrid contains two 8s, making the board invalid.